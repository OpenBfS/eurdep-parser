package de.bfs.eurdepparser;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.bfs.eurdepparser.parser.model.ApparatusType;
import de.bfs.eurdepparser.parser.model.NuclideCategory;
import de.bfs.eurdepparser.parser.model.SampleTreatment;
import de.bfs.eurdepparser.parser.model.SampleType;
import de.bfs.eurdepparser.parser.model.UncertaintyType;
import de.bfs.eurdepparser.parser.model.Unit;
import de.bfs.eurdepparser.parser.model.ValueType;

public class Data {

    private static Data instance = null;

    private static Logger LOG = Logger.getLogger("Data");

    private Map<String, ApparatusType> apparatusType;
    private Map<String, NuclideCategory> nuclideCategory;
    private Map<String, SampleTreatment> sampleTreatment;
    private Map<String, SampleType> sampleType;
    private Map<String, UncertaintyType> uncertaintyType;
    private Map<String, Unit> unit;
    private Map<String, ValueType> valueType;
    private Map<String, ApparatusType> apparatusTypeByText;
    private Map<String, NuclideCategory> nuclideCategoryByText;
    private Map<String, SampleTreatment> sampleTreatmentByText;
    private Map<String, SampleType> sampleTypeByText;
    private Map<String, UncertaintyType> uncertaintyTypeByText;
    private Map<String, Unit> unitByText;
    private Map<String, ValueType> valueTypeByText;

    private Data() throws JsonParseException, JsonMappingException, IOException {
        LOG.setLevel(Level.WARNING);
        apparatusType = new HashMap<String, ApparatusType>();
        nuclideCategory = new HashMap<String, NuclideCategory>();
        sampleTreatment = new HashMap<String, SampleTreatment>();
        sampleType = new HashMap<String, SampleType>();
        uncertaintyType = new HashMap<String, UncertaintyType>();
        unit = new HashMap<String, Unit>();
        valueType = new HashMap<String, ValueType>();
        apparatusTypeByText = new HashMap<String, ApparatusType>();
        nuclideCategoryByText = new HashMap<String, NuclideCategory>();
        sampleTreatmentByText = new HashMap<String, SampleTreatment>();
        sampleTypeByText = new HashMap<String, SampleType>();
        uncertaintyTypeByText = new HashMap<String, UncertaintyType>();
        unitByText = new HashMap<String, Unit>();
        valueTypeByText = new HashMap<String, ValueType>();
        loadData();
    }

    public static Data getInstance() throws JsonParseException, JsonMappingException, IOException {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }

    private void loadData() throws JsonParseException, JsonMappingException, IOException {
        loadApparatusTypes();
        loadNuclideCategories();
        loadSampleTreatment();
        loadSampleType();
        loadUncertaintyType();
        loadUnits();
        loadValueTypes();
    }

    private void loadApparatusTypes() throws JsonParseException, JsonMappingException, IOException {
        LOG.info("Loading apparatus types");
        InputStream in = loadFile("apparatus_type.json");
        ObjectMapper m = new ObjectMapper();
        ApparatusType[] types = m.readValue(in, ApparatusType[].class);
        for (ApparatusType type: types) {
            apparatusType.put(type.getApparatus(), type);
            apparatusTypeByText.put(type.getApparatusText(), type);
        }
    }

    private void loadNuclideCategories() throws JsonParseException, JsonMappingException, IOException {
        LOG.info("Loading nuclde categories");
        InputStream in = loadFile("nuclide_category.json");
        ObjectMapper m = new ObjectMapper();
        NuclideCategory[] categories = m.readValue(in, NuclideCategory[].class);
        for (NuclideCategory category: categories) {
            nuclideCategory.put(category.getNuclide(), category);
            nuclideCategoryByText.put(category.getNuclideText(), category);
        }
    }

    private void loadSampleTreatment() throws JsonParseException, JsonMappingException, IOException {
        LOG.info("Loading sample treatments");
        InputStream in = loadFile("sample_treatment.json");
        ObjectMapper m = new ObjectMapper();
        SampleTreatment[] treatments = m.readValue(in, SampleTreatment[].class);
        for (SampleTreatment treatment: treatments) {
            sampleTreatment.put(treatment.getSampleTreatment(), treatment);
            sampleTreatmentByText.put(treatment.getSampleTreatmentText(), treatment);
        }
    }

    private void loadSampleType() throws JsonParseException, JsonMappingException, IOException {
        LOG.info("Loading sample types");
        InputStream in = loadFile("sample_type_code.json");
        ObjectMapper m = new ObjectMapper();
        SampleType[] types = m.readValue(in, SampleType[].class);
        for (SampleType type: types) {
            sampleType.put(type.getSampleType(), type);
            sampleTypeByText.put(type.getSympleTypeText(), type);
        }
    }

    private void loadUncertaintyType() throws JsonParseException, JsonMappingException, IOException {
        LOG.info("Loading uncertainty types");
        InputStream in = loadFile("uncertainty_type.json");
        ObjectMapper m = new ObjectMapper();
        UncertaintyType[] types = m.readValue(in, UncertaintyType[].class);
        for (UncertaintyType type: types) {
            uncertaintyType.put(type.getUncertaintyType(), type);
            uncertaintyTypeByText.put(type.getUncertaintyTypeText(), type);
        }
    }

    private void loadUnits() throws JsonParseException, JsonMappingException, IOException {
        LOG.info("Loading units");
        InputStream in = loadFile("eurdep_unit.json");
        ObjectMapper m = new ObjectMapper();
        Unit[] units = m.readValue(in, Unit[].class);
        for (Unit unit: units) {
            this.unit.put(unit.getUnit(), unit);
            unitByText.put(unit.getUnitText(), unit);
        }
    }

    private void loadValueTypes() throws JsonParseException, JsonMappingException, IOException {
        LOG.info("Loading value types");
        InputStream in = loadFile("value_type.json");
        ObjectMapper m = new ObjectMapper();
        ValueType[] types = m.readValue(in, ValueType[].class);
        for (ValueType type: types) {
            this.valueType.put(type.getValueType(), type);
            valueTypeByText.put(type.getValueTypeText(), type);
        }
    }

    private InputStream loadFile(String fileName) throws IllegalArgumentException{
        // The class loader that loaded the class
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }
    }

    public ApparatusType getApparatusTypeByCode(String code) {
        return apparatusType.containsKey(code)?
            apparatusType.get(code): null;
    }

    public NuclideCategory getNuclideCategoryByNuclide(String nuclide) {
        return nuclideCategory.containsKey(nuclide)?
            nuclideCategory.get(nuclide): null;
    }

    public SampleTreatment getSampleTreatmentBySampleTreatment(String sampleTreatment) {
        return this.sampleTreatment.containsKey(sampleTreatment)?
            this.sampleTreatment.get(sampleTreatment): null;
    }

    public SampleType getSampleTypeBySampleType(String sampleType) {
        return this.sampleType.containsKey(sampleType)?
            this.sampleType.get(sampleType): null;
    }

    public UncertaintyType getUncertaintyTypeByUncertaintyType(String uncertaintyType) {
        return this.uncertaintyType.containsKey(uncertaintyType)?
            this.uncertaintyType.get(uncertaintyType): null;
    }

    public Unit getUnitByUnit(String unit) {
        return this.unit.containsKey(unit)?
            this.unit.get(unit): null;
    }

    public ValueType getValueTypeByValueType(String valueType) {
        return this.valueType.containsKey(valueType)?
            this.valueType.get(valueType): null;
    }

    public ApparatusType getApparatusTypeByText(String code) {
        return apparatusTypeByText.containsKey(code)?
            apparatusTypeByText.get(code): null;
    }

    public NuclideCategory getNuclideCategoryByText(String nuclide) {
        return nuclideCategoryByText.containsKey(nuclide)?
            nuclideCategoryByText.get(nuclide): null;
    }

    public SampleTreatment getSampleTreatmentByText(String sampleTreatment) {
        return this.sampleTreatmentByText.containsKey(sampleTreatment)?
            this.sampleTreatmentByText.get(sampleTreatment): null;
    }

    public SampleType getSampleTypeByText(String sampleType) {
        return this.sampleTypeByText.containsKey(sampleType)?
            this.sampleTypeByText.get(sampleType): null;
    }

    public UncertaintyType getUncertaintyTypeByText(String uncertaintyType) {
        return this.uncertaintyTypeByText.containsKey(uncertaintyType)?
            this.uncertaintyTypeByText.get(uncertaintyType): null;
    }

    public Unit getUnitByText(String unit) {
        return this.unitByText.containsKey(unit)?
            this.unitByText.get(unit): null;
    }

    public ValueType getValueTypeByText(String valueType) {
        return this.valueTypeByText.containsKey(valueType)?
            this.valueTypeByText.get(valueType): null;
    }
}
