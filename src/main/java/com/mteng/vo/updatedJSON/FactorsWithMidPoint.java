package com.mteng.vo.updatedJSON;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
	"id",
	"midPoint",
	"label"
})
public class FactorsWithMidPoint {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("midPoint")
	private Long midPoint;

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

	@JsonProperty("midPoint")
	public Long getMidPoint() {
		return midPoint;
	}

	@JsonProperty("midPoint")
	public void setMidPoint(Long midPoint) {
		this.midPoint = midPoint;
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