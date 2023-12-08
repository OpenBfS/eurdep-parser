package de.bfs.eurdepparser.parser;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import de.bfs.eurdepparser.Data;
import de.bfs.eurdepparser.parser.eurdep.EurdepBaseListener;
import de.bfs.eurdepparser.parser.eurdep.EurdepParser;
import de.bfs.eurdepparser.parser.model.ApparatusType;
import de.bfs.eurdepparser.parser.model.NuclideCategory;
import de.bfs.eurdepparser.parser.model.SampleTreatment;
import de.bfs.eurdepparser.parser.model.SampleType;
import de.bfs.eurdepparser.parser.model.UncertaintyType;
import de.bfs.eurdepparser.parser.model.Unit;
import de.bfs.eurdepparser.parser.model.ValueType;

public class EurdepListener extends EurdepBaseListener {

    private enum section {HEADER, LOCALITY, RADIOLOGICAL, NONE, UNKOWN}

    private static final String COMMENT_KEY = "COMMENT";
    private static final String LOCALITY_COMMENT_KEY = "LOCALITY_COMMENT";
    private static final String MEASURE_COMMENT_KEY = "MEASURE_COMMENT";

    private static Logger LOG = Logger.getLogger("EURDEPListener");

    private Data data;

    private section currentSection;
    private JsonNode currentNode;

    private String currentComment;
    private String defaultComment;

    private boolean defaultBlock;
    private Map<String, String> defaultValues;
    private List<String> fieldList;

    // Error and warning objects
    ObjectNode errors;
    ObjectNode warnings;

    private ObjectNode result;
    private ObjectMapper mapper;

    // Bundle to translate codes to human readable strings.
    ResourceBundle i18n;

    public EurdepListener() {
        LOG.setLevel(Level.WARNING);
        LOG.info("Creating Listener");
        Locale de = Locale.GERMAN;
        i18n = ResourceBundle.getBundle("eurdepimport", de);

        this.mapper = new ObjectMapper();

        this.errors = mapper.createObjectNode();
        this.warnings = mapper.createObjectNode();

        try {
            data = Data.getInstance();
        } catch (JsonParseException e) {
            e.printStackTrace();
            this.errors.put("data", i18n.getString("600"));
            return;
        } catch (JsonMappingException e) {

            e.printStackTrace();
            this.errors.put("data", i18n.getString("600"));
            return;
        } catch (IOException e) {

            e.printStackTrace();
            this.errors.put("data", i18n.getString("600"));
            return;
        }
        this.result = mapper.createObjectNode();
        this.result.set("errors", errors);
        this.result.set("warnings", warnings);
    }

    public ObjectNode getResult() {
        ObjectMapper mapper = new ObjectMapper();
        //Overwrite timezone to UTC
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        mapper.setDateFormat(df);
        mapper.setTimeZone(TimeZone.getTimeZone("UTC"));
        return this.result;
    }


    private void addError(String key, Integer line, String value, String  cause) {
        if (this.errors.get(key) == null) {
            ArrayNode an = this.mapper.createArrayNode();
            this.errors.set(key, an);
        }
        ObjectNode err = mapper.createObjectNode();
        err.put("line", line);
        err.put("value", value);
        err.put("cause", cause);
        ((ArrayNode)this.errors.get(key)).add(err);
    }

    private void addWarning(String key, Integer line, String value, String  cause) {
        if (this.warnings.get(key) == null) {
            ArrayNode an = this.mapper.createArrayNode();
            this.warnings.set(key, an);
        }
        ObjectNode warn = mapper.createObjectNode();
        warn.put("line", line);
        warn.put("value", value);
        warn.put("cause", cause);
        ((ArrayNode)this.warnings.get(key)).add(warn);
    }

    /**
     * @return the errors
     */
    public ObjectNode getErrors() {
        return errors;
    }

    /**
     * @return the warnings
     */
    public ObjectNode getWarnings() {
        return warnings;
    }

    @Override
    public void enterComment(EurdepParser.CommentContext ctx) {
        LOG.info("Enter comment");
        String comment = "";
        //Extract comments from ctx
        for (int i = 1; i < ctx.getChildCount() - 1; i++) {
            comment += i == 1? ctx.getChild(i): " " + ctx.getChild(i);
        }
        switch (this.currentSection) {
            case LOCALITY:
            case RADIOLOGICAL:
                if (this.currentComment != null && !this.currentComment.isEmpty()) {
                    storeComment();
                }
            default: break;
        }
        if (this.defaultBlock == true) {
            this.defaultComment = comment;
        } else {
            this.currentComment = comment;
        }
    }

    @Override
    public void exitComment(EurdepParser.CommentContext ctx) {
        switch (this.currentSection) {
            case HEADER:
                storeComment();
                break;
            default: break;
        }
    }

    /**
     * Store the current comment in the result json.
     *
     * The placement depends on the current section.
     */
    private void storeComment() {
        if (currentComment == null || currentComment.isEmpty()) {
            return;
        }
        String key;
        switch (this.currentSection) {
            case HEADER: key = COMMENT_KEY; break;
            case LOCALITY: key = LOCALITY_COMMENT_KEY; break;
            case RADIOLOGICAL: key = MEASURE_COMMENT_KEY; break;
            default: return;
        }

        if (result.get(key) == null) {
            result.put(key, currentComment);
        } else {
            String appendedComment = result.get(key).asText();
            appendedComment += ",";
            appendedComment += currentComment;
            result.put(key, appendedComment);
        }
        currentComment = null;
    }

    public void exitEurdepfile(EurdepParser.EurdepfileContext ctx) {
        LOG.info("Eurdep file parsed");
    }

    public void enterEurdep_header(EurdepParser.Eurdep_headerContext ctx) {
        LOG.info("Entering header");
        currentSection = section.HEADER;
    }

    public void enterLocality(EurdepParser.LocalityContext ctx) {
        storeComment();
        LOG.info("Entering locality");
        currentSection = section.LOCALITY;
        currentNode = mapper.createArrayNode();
        result.set("LOCALITY", currentNode);
    }

    public void exitLocality(EurdepParser.LocalityContext ctx) {
        storeComment();
        currentNode = null;
        defaultValues = null;
        defaultComment = null;
        currentSection = section.NONE;
    }

    public void enterRadiological(EurdepParser.RadiologicalContext ctx) {
        storeComment();
        LOG.info("Entering radiological");
        currentSection = section.RADIOLOGICAL;
        currentNode = mapper.createArrayNode();
        result.set("MEASURE", currentNode);
        defaultValues = new HashMap<String,String>();
    }

    public void exitRadiological(EurdepParser.RadiologicalContext ctx) {
        storeComment();
        currentNode = null;
        defaultValues = null;
        defaultComment = null;
        currentSection = section.NONE;
    }

    public void enterDefault_record(EurdepParser.Default_recordContext ctx) {
        storeComment();
        if(currentSection == section.UNKOWN) {
            return;
        }
        LOG.info(String.format("Parsing default record(%s): %s - %s - %s", ctx.getChildCount(), ctx.getChild(0).getText(), ctx.getChild(1).getText(), ctx.getChild(2).getText()));

        if (ctx.getChildCount() < 4 ) {
            this.addError("defaultEntry", ctx.getStart().getLine(), "count", i18n.getString("673"));
        }
        defaultValues.put(ctx.getChild(1).getText(), ctx.getChild(2).getText());
    }

    @Override public void enterUnknown_section(EurdepParser.Unknown_sectionContext ctx) {
        LOG.info("Entering unkown");
        LOG.info(ctx.getText());
        currentSection = section.UNKOWN;
    }

    /**
     * Parse field list
     * Format: \ FIELD_LIST {List of fields};
     */
    public void enterField_list(EurdepParser.Field_listContext ctx) {
        storeComment();
        if(currentSection == section.UNKOWN) {
            return;
        }
        LOG.info(String.format("Parsing field list(%s): %s", ctx.getChildCount(), ctx.getText()));
        //Trim children
        ctx.removeLastChild();
        if (ctx.getChild(ctx.getChildCount() - 1 ).getText().equals(";")) {
            ctx.removeLastChild();
        }
        fieldList = new ArrayList<String>();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            String child = ctx.getChild(i).getText();
            if (!child.equals(",")) {
                fieldList.add(child);
            }
        }
        LOG.info(String.format("Fields: %s", fieldList.toString()));
    }

    public void enterRecord(EurdepParser.RecordContext ctx) {
        switch (currentSection) {
            case LOCALITY:
                parseLocalityRecord(ctx);
                break;
            case RADIOLOGICAL:
                parseRadiologicalRecord(ctx);
                break;
            default:
                break;
        }
    }

    @Override
    public void enterDefault_section(EurdepParser.Default_sectionContext ctx) {
        defaultBlock = true;
    }

    @Override
    public void exitDefault_section(EurdepParser.Default_sectionContext ctx) {
        defaultBlock = false;
    }

    /**
     * Parse header line
     * Format: \HEADER_NAME HEADER_VALUE [addition values];
     * @param ctx
     */
    public void enterHeader_field(EurdepParser.Header_fieldContext ctx) {
        if (ctx.getChildCount() < 4) {
            this.addError("header", ctx.getStart().getLine(), "count", i18n.getString("673"));
        }
        String headerName = ctx.getChild(1).getText();
        String headerValue = ctx.getChild(2).getText();;
        //Concat header values
        for (int i = 3; i <= ctx.getChildCount() - 2; i++) {
            headerValue = headerValue.concat(String.format(" %s", ctx.getChild(i).getText()));
        }
        LOG.info(String.format("Header: %s - %s", headerName, headerValue));
        result.put(headerName, headerValue);
    }

    /**
     * Parse locality record
     * Format: \VALUE, VALUE, ...;
     * @param ctx
     */
    private void parseLocalityRecord(EurdepParser.RecordContext ctx) {
        LOG.info(String.format("Parsing locality record (%s): %s", ctx.getChildCount(), ctx.getText()));
        LOG.info(String.format("Fields: %s", fieldList.toString()));
        ctx.removeLastChild();
        if (ctx.getChild(ctx.getChildCount() - 1).getText().equals(";")) {
            ctx.removeLastChild();
        }

        ObjectNode record = mapper.createObjectNode();

        //Check line length
        if (ctx.getChildCount() < fieldList.size() + 1 ) {
            this.addError("localityRecord", ctx.getStart().getLine(), "count", i18n.getString("673"));
        }

        String comment = "";
        if (this.defaultComment != null && !this.defaultComment.isEmpty()) {
            comment = defaultComment;
        }
        //Store comments if present
        if (currentComment != null && !currentComment.isEmpty()) {
            if (!comment.isEmpty()) {
                comment+= ", ";
            }
            comment += currentComment;
        }
        if (!comment.isEmpty()) {
            record.put(COMMENT_KEY, comment);
            currentComment = null;
        }
        //Concat tokens and insert
        String currentRecord = "";
        int currentField = 0;
        for (int i = 1; i < ctx.getChildCount(); i++) {
            String child = ctx.getChild(i).getText();
            if (child.equals(",")) {
                record.put(fieldList.get(currentField), currentRecord.trim());
                currentField++;
                currentRecord = "";
            } else {
                currentRecord += " ";
                currentRecord += child;
            }
        }
        //Check line length in order to avoid IndexOutOfBoundsException
        if (currentField < fieldList.size()) {
            record.put(fieldList.get(currentField), currentRecord.trim());
            LOG.info(String.format("Created node: %s", record.toPrettyString()));
            ((ArrayNode) currentNode).add(record);
        } else {
            this.addError("localityRecord", ctx.getStart().getLine(), "count", i18n.getString("675"));
        }
    }

    private void parseRadiologicalRecord(EurdepParser.RecordContext ctx) {
        LOG.info(String.format("Parsing radiological record (%s): %s", ctx.getChildCount(), ctx.getText()));
        ctx.removeLastChild();
        if (ctx.getChild(ctx.getChildCount() - 1).getText().equals(";")) {
            ctx.removeLastChild();
        }
        ObjectNode record = mapper.createObjectNode();
        //Check line length
        if (ctx.getChildCount() < fieldList.size() + 1 ) {
            this.addError("radiologicalRecord", ctx.getStart().getLine(), "count", i18n.getString("673"));
        }

        String comment = "";
        if (this.defaultComment != null && !this.defaultComment.isEmpty()) {
            comment = defaultComment;
        }
        //Store comments if present
        if (currentComment != null && !currentComment.isEmpty()) {
            if (!comment.isEmpty()) {
                comment+= ", ";
            }
            comment += currentComment;
        }
        if (!comment.isEmpty()) {
            record.put(COMMENT_KEY, comment);
            currentComment = null;
        }

        ArrayList<String> fieldList = new ArrayList<String>();
        List<String> values = new ArrayList<String>();
        //Insert default values/fields
        defaultValues.forEach((k, v) -> {
            fieldList.add(k);
            values.add(v);
        });

        //Add record fields
        fieldList.addAll(this.fieldList);
        String currentRecord = "";
        for (int i = 1; i < ctx.getChildCount(); i++) {
            String child = ctx.getChild(i).getText();
            if (child.equals(",")) {
                
                values.add(currentRecord.trim().replaceAll("\"", ""));
                currentRecord = "";
            } else {
                currentRecord += " ";
                currentRecord += child;
            }
        }
        values.add(currentRecord.trim().replaceAll("\"", ""));

        LOG.info("Values " + values.toString());

        for (int i = 0; i < values.size(); i++) {
            String field = fieldList.get(i);
            String value = values.get(i).trim();
            //Check for special characters or empty fields
            switch(value) {
                case "!":
                    //Explicitly use default
                    if (defaultValues.containsKey(field)) {
                        value = defaultValues.get(field);
                    } else {
                        this.addError("radiologicalRecord", ctx.getStart().getLine(), "default", i18n.getString("673"));
                        value = "";
                    }
                    break;
                case "-":
                    //Explicitly use no value
                    value = "";
                    break;
            }
            if (value == null || value.equals("")) {
                //If empty, check for default
                if (defaultValues.containsKey(field)) {
                    value = defaultValues.get(field);
                } else {
                    record.put(field, "");
                    continue;
                }
            }
            //Check for translatable values
            switch (field) {
                case "APPARATUS":
                    ApparatusType type = data.getApparatusTypeByCode(value);
                    if (type == null) {
                        this.addError("ApparatusType", ctx.getStart().getLine(), value, i18n.getString("675"));
                    } else {
                        value = type.getApparatus();
                    }
                    break;
                case "NUCLIDE":
                    NuclideCategory nuclide = data.getNuclideCategoryByNuclide(value);
                    if (nuclide == null) {
                        this.addError("NuclideCategory", ctx.getStart().getLine(), value, i18n.getString("675"));
                    } else {
                        value = nuclide.getNuclide();
                    }
                    break;
                case "SAMPLE_TREATMENT":
                    SampleTreatment sampleTreatment = data.getSampleTreatmentBySampleTreatment(value);
                    if (sampleTreatment == null) {
                        this.addError("SampleTreatment", ctx.getStart().getLine(), value, i18n.getString("675"));
                    } else {
                        value = sampleTreatment.getSampleTreatment();
                    }
                    break;
                case "SAMPLE_TYPE":
                    SampleType sampleType = data.getSampleTypeBySampleType(value);
                    if (sampleType == null) {
                        this.addError("SampleType", ctx.getStart().getLine(), value, i18n.getString("675"));
                    } else {
                        value = sampleType.getSampleType();
                    }
                    break;
                case "UNCERTAINTY_TYPE":
                    UncertaintyType uncertaintyType = data.getUncertaintyTypeByUncertaintyType(value);
                    if (uncertaintyType == null) {
                        this.addError("UncertaintyType", ctx.getStart().getLine(), value, i18n.getString("675"));
                    } else {
                        value = uncertaintyType.getUncertaintyType();
                    }
                    break;
                case "UNIT":
                    Unit unit = data.getUnitByUnit(value);
                    if (unit == null) {
                        this.addError("Unit", ctx.getStart().getLine(), value, i18n.getString("675"));
                    } else {
                        value = unit.getUnit();
                    }
                    break;
                case "VALUE_TYPE":
                    ValueType valueType = data.getValueTypeByValueType(value);
                    if (valueType == null) {
                        this.addError("ValueType", ctx.getStart().getLine(), value, i18n.getString("675"));
                    } else {
                        value = valueType.getValueType();
                    }
                }
            record.put(field, value);

        }
        ((ArrayNode)currentNode).add(record);
    }
}
