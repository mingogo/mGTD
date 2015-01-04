package com.mteng.vo.updatedJSON;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "value",
    "label",
    "isSelected"
})
public class Option {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("value")
    private Long value;
    @JsonProperty("label")
    private String label;
    @JsonProperty("isSelected")
    private Boolean isSelected;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public Option withId(Long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("value")
    public Long getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Long value) {
        this.value = value;
    }

    public Option withValue(Long value) {
        this.value = value;
        return this;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public Option withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("isSelected")
    public Boolean getIsSelected() {
        return isSelected;
    }

    @JsonProperty("isSelected")
    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public Option withIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
        return this;
    }
}