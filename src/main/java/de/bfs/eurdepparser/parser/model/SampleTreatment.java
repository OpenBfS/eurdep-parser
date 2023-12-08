package de.bfs.eurdepparser.parser.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SampleTreatment implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("sample_treatment")
    private String sampleTreatment;

    @JsonProperty("sample_treatment_text")
    private String sampleTreatmentText;

    public SampleTreatment() {}

    public String getSampleTreatment() {
        return sampleTreatment;
    }

    public void setSampleTreatment(String sampleTreatment) {
        this.sampleTreatment = sampleTreatment;
    }

    public String getSampleTreatmentText() {
        return sampleTreatmentText;
    }

    public void setSampleTreatmentText(String sampleTreatmentText) {
        this.sampleTreatmentText = sampleTreatmentText;
    }
}
