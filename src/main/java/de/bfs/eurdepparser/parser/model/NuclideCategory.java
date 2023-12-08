package de.bfs.eurdepparser.parser.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NuclideCategory implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer code;

    private String nuclide;

    @JsonProperty("nuclide_text")
    private String nuclideText;

    @JsonProperty("idf_code")
    private String idfNuclideKey;

    public NuclideCategory() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getNuclide() {
        return nuclide;
    }

    public void setNuclide(String nuclide) {
        this.nuclide = nuclide;
    }

    public String getNuclideText() {
        return nuclideText;
    }

    public void setNuclideText(String nuclideText) {
        this.nuclideText = nuclideText;
    }

    public String getIdfNuclideKey() {
        return idfNuclideKey;
    }

    public void setIdfNuclideKey(String idfNuclideKey) {
        this.idfNuclideKey = idfNuclideKey;
    }

}
