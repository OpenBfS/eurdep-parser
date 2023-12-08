package de.bfs.eurdepparser.parser.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValueType implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("value_type")
    private String valueType;

    @JsonProperty("value_type_text")
    private String valueTypeText;

    public ValueType() {}

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getValueTypeText() {
        return valueTypeText;
    }

    public void setValueTypeText(String valueTypeText) {
        this.valueTypeText = valueTypeText;
    }
}
