package de.bfs.eurdepparser.parser.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApparatusType implements Serializable {
    private static final long serialVersionUID = 1L;

    private String apparatus;

    @JsonProperty("apparatus_text")
    private String apparatusText;

    public ApparatusType() {};

    public String getApparatus() {
        return apparatus;
    }

    public String getApparatusText() {
        return apparatusText;
    }

    public void setApparatus(String apparatus) {
        this.apparatus = apparatus;
    }

    public void setApparatusText(String apparatusText) {
        this.apparatusText = apparatusText;
    }
}
