package com.mteng.vo.updatedJSON;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "id",
    "rating",
    "influence",
    "label"
})
public class Factor {

    @JsonProperty("id")
	private Long id;
    @JsonProperty("label")
	private String label;

    @JsonProperty("id")
	public Long getId() {
		return id;
	}
    @JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}
    @JsonProperty("label")
	public String getLabel() {
		return label;
	}
    @JsonProperty("label")
	public void setLabel(String label) {
		this.label = label;
	}
}