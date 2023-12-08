package de.bfs.eurdepparser.parser.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SampleType implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("sample_type")
    private String sampleType;

    @JsonProperty("symple_type_text")
    private String sympleTypeText;

    public SampleType () {}

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public String getSympleTypeText() {
        return sympleTypeText;
    }

    public void setSympleTypeText(String sympleTypeText) {
        this.sympleTypeText = sympleTypeText;
    }
}
