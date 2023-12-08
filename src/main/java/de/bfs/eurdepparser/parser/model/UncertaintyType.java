package de.bfs.eurdepparser.parser.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UncertaintyType implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("uncertainty_type")
    private String uncertaintyType;

    @JsonProperty("uncertainty_type_text")
    private String uncertaintyTypeText;

    public UncertaintyType() {}

    public String getUncertaintyType() {
        return uncertaintyType;
    }

    public void setUncertaintyType(String uncertaintyType) {
        this.uncertaintyType = uncertaintyType;
    }

    public String getUncertaintyTypeText() {
        return uncertaintyTypeText;
    }

    public void setUncertaintyTypeText(String uncertaintyTypeText) {
        this.uncertaintyTypeText = uncertaintyTypeText;
    }
}
