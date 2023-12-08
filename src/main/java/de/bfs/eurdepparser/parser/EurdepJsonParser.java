package de.bfs.eurdepparser.parser;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import de.bfs.eurdepparser.EURDEPStrings;
import de.bfs.eurdepparser.parser.model.json.EurdepJson;
import de.bfs.eurdepparser.parser.model.json.EurdepJsonStructure;
import de.bfs.eurdepparser.parser.model.json.Locality;
import de.bfs.eurdepparser.parser.model.json.Radiological;
import de.bfs.eurdepparser.parser.model.json.EurdepJsonStructure.InvalidStructureException;

/**
 * Converter class to convert json to eurdep.
 * @author Alexander Woestmann <awoestmann@intevation.de>
 */
public class EurdepJsonParser {

    private static Logger LOG = Logger.getLogger("EURDEPJSONParser");

    private EurdepJson eurdepJsonObj;
    private EurdepJsonStructure structure;

    //Eurdep parts
    private String header;
    private String locality;
    private String radiological;

    private String result;

    /**
     * Constructor.
     * @param structureString Structure json as stream
     */
    public EurdepJsonParser (InputStream structureStream) throws InvalidStructureException {
        LOG.info("Reading structure json");
        Jsonb jsonb = JsonbBuilder.create();
        structure = jsonb.fromJson(structureStream, EurdepJsonStructure.class);
        structure.validateLocalityFields();
        structure.validateRadiologicalFields();
    }

    private String buildResult() {
        StringBuilder sb = new StringBuilder();
        sb.append(createLine(EURDEPStrings.BEGIN_EURDEP));
        sb.append(EURDEPStrings.LINE_BREAK);
        sb.append(header);
        sb.append(EURDEPStrings.LINE_BREAK);
        sb.append(locality);
        sb.append(EURDEPStrings.LINE_BREAK);
        sb.append(radiological);
        sb.append(EURDEPStrings.LINE_BREAK);
        sb.append(createLine(EURDEPStrings.END_EURDEP));
        return sb.toString();
    }

    /**
     * Convert the given json input to EURDEP.
     * @param jsonStream JSON to convert as String
     * @return Eurdep as Stream
     * @throws MissingMandatoryFieldException Thrown if mandatory field is missing
     */
    public String convert (InputStream jsonStream) throws MissingMandatoryFieldException {

        Jsonb jsonb = JsonbBuilder.create();
        eurdepJsonObj = jsonb.fromJson(jsonStream, EurdepJson.class);
        header = createHeader(eurdepJsonObj);
        locality = createLocality(eurdepJsonObj.getLocality());
        radiological = createRadiological(eurdepJsonObj.getMeasure());

        result = buildResult();

        return result;
    }

    /**
     * Create a eurdep header from the given json model.
     *
     * Note: The result includes the begin and end tags ("BEGIN_HEADER", "END_HEADER")
     * @param eurdepJsonObj Model to use
     * @return Result as String
     * @throws MissingMandatoryFieldException Thrown if mandatory field is missing
     */
    private String createHeader(EurdepJson eurdepJsonObj) throws MissingMandatoryFieldException {
        LOG.info("Building header");

        Map<String, String> headerMap = eurdepJsonObj.getHeaderFields();

        //Check mandatory fields: importance, originator, sent, message id
        if (headerMap.get(EURDEPStrings.IMPORTANCE) == null
            || headerMap.get(EURDEPStrings.IMPORTANCE).isEmpty()) {
            throw new MissingMandatoryFieldException(EURDEPStrings.IMPORTANCE, "header");
        }
        if (headerMap.get(EURDEPStrings.ORIGINATOR) == null
            || headerMap.get(EURDEPStrings.ORIGINATOR).isEmpty()) {
                throw new MissingMandatoryFieldException(EURDEPStrings.ORIGINATOR, "header");
        }
        if (headerMap.get(EURDEPStrings.SENT) == null
            || headerMap.get(EURDEPStrings.SENT).isEmpty()) {
                throw new MissingMandatoryFieldException(EURDEPStrings.SENT, "header");
        }
        if (headerMap.get(EURDEPStrings.MESSAGE_ID) == null
            || headerMap.get(EURDEPStrings.MESSAGE_ID).isEmpty()) {
            throw new MissingMandatoryFieldException(EURDEPStrings.MESSAGE_ID, "header");
        }

        StringBuilder sb = new StringBuilder();
        sb.append(createLine(EURDEPStrings.BEGIN_HEADER));

        //Insert header fields
        headerMap.forEach((name, value) -> {
            if (value != null && !value.isEmpty()) {
                sb.append(createLine(name + " " + value));
            }
        });

        sb.append(createLine(EURDEPStrings.END_HEADER));
        return sb.toString();
    }

    /**
     * Create a eurdep locality section from the given json model.
     * @param localities Locality model list
     * @return Result as String
     * @throws MissingMandatoryFieldException Thrown if a mandatory field is missing
     */
    private String createLocality(List<Locality> localities) throws MissingMandatoryFieldException {
        LOG.info("Building locality section");
        StringBuilder sb = new StringBuilder();

        sb.append(createLine(EURDEPStrings.BEGIN_LOCALITY));

        String fieldList = EURDEPStrings.FIELD_LIST + " " + String.join(",", structure.getLocalityFields());
        sb.append(createLine(fieldList));

        //Append locality data
        for (int i = 0; i < localities.size(); i++ ) {
            Locality locality = localities.get(i);
            //Check mandatory fields
            if (locality.getLatitude() == null || locality.getLatitude().isEmpty()) {
                throw new MissingMandatoryFieldException(EURDEPStrings.LOCAL_LATITUDE, "locality", locality.toString());
            }
            if (locality.getLongitude() == null || locality.getLongitude().isEmpty()) {
                throw new MissingMandatoryFieldException(EURDEPStrings.LOCAL_LONGITUDE, "locality", locality.toString());
            }
            if (locality.getLocalityCode() == null || locality.getLocalityCode().isEmpty()) {
                throw new MissingMandatoryFieldException(EURDEPStrings.LOCAL_LOCALITY_CODE, "locality", locality.toString());
            }

            StringBuilder lineBuilder = new StringBuilder();
            Arrays.stream(structure.getLocalityFields()).forEach(field -> {
                if (lineBuilder.length() > 0) {
                    lineBuilder.append(",");
                }
                String value = locality.get(field) != null? locality.get(field): "";
                lineBuilder.append(value);
            });
            sb.append(createLine(lineBuilder.toString()));
        }

        sb.append(createLine(EURDEPStrings.END_LOCALITY));
        return sb.toString();
    }

    /**
     * Create a eurdep radiological section from the given json model.
     * @param localities Radiological model list
     * @return Result as String
     * @throws MissingMandatoryFieldException Thrown if a mandatory field is missing
     */
    private String createRadiological(List<Radiological> measures) throws MissingMandatoryFieldException {
        LOG.info("Building radiological section");
        LOG.info(String.format("Adding %d records", measures.size()));
        StringBuilder sb = new StringBuilder();
        sb.append(createLine(EURDEPStrings.BEGIN_RADIOLOGICAL));

        String fieldList = EURDEPStrings.FIELD_LIST + " " + String.join(",", structure.getRadiologicalFields());
        sb.append(createLine(fieldList));

        for (int i = 0; i < measures.size(); i++) {
            Radiological measure = measures.get(i);
            //Check mandatory fields
            //Locality_code OR (Latitude AND Longitude)
            if (measure.getLocalityCode() == null
                && (measure.getLatitude() == null && measure.getLongitude() == null)) {
                    String fields = EURDEPStrings.RAD_LOCALITY_CODE + ", " + EURDEPStrings.RAD_LATITUDE + ", " + EURDEPStrings.RAD_LONGITUDE;
                    throw new MissingMandatoryFieldException(fields, "radiological", measure.toString());
            }

            //If Uncertainty is given also Uncertainty_type and Uncertainty_Unit must be specified
            if (measure.getUncertainty() != null
                && (measure.getUncertaintyType() == null || measure.getUncertaintyUnit() == null)) {
                    String fields = EURDEPStrings.RAD_UNCERTAINTY + ", " + EURDEPStrings.RAD_UNCERTAINTY_TYPE + ", " + EURDEPStrings.RAD_UNCERTAINTY_UNIT;
                    throw new MissingMandatoryFieldException(fields, "radiological", measure.toString());
            }

            StringBuilder lineBuilder = new StringBuilder();
            Arrays.stream(structure.getRadiologicalFields()).forEach(field -> {
                if (lineBuilder.length() > 0) {
                    lineBuilder.append(",");
                }
                String value = measure.get(field) != null? measure.get(field): "";
                lineBuilder.append(value);
            });
            sb.append(createLine(lineBuilder.toString()));
        }

        sb.append(createLine(EURDEPStrings.END_RADIOLOGICAL));
        return sb.toString();
    }

    /**
     * Utility method to create an eurdep line using the given content.
     * @param content content
     * @return Line as String
     */
    private String createLine(String content) {
        return EURDEPStrings.BEGIN_LINE + content + EURDEPStrings.END_LINE + EURDEPStrings.LINE_BREAK;
    }

    public class MissingMandatoryFieldException extends Exception {
        private String fieldname;
        private String part;
        private String object;
        public MissingMandatoryFieldException(String fieldname, String part) {
            this.fieldname = fieldname;
            this.part = part;
        }
        public MissingMandatoryFieldException(String fieldname, String part, String object) {
            this(fieldname, part);
            this.object = object;
        }
        public String getFieldname() {
            return fieldname;
        }
        public String getPart() {
            return part;
        }
        public String getObject() {
            return object;
        }
    }
}
