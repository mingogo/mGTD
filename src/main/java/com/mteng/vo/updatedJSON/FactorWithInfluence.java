package com.mteng.vo.updatedJSON;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
	"id",
	"influence",
	"label"
})
public class FactorWithInfluence {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("influence")
	private Long influence;

	@JsonProperty("label")
	private String label;


	@JsonProperty("influence")
	public Long getInfluence() {
		return influence;
	}

	@JsonProperty("influence")
	public void setInfluence(Long influence) {
		this.influence = influence;
	}

	@JsonProperty("label")
	public String getLabel() {
		return label;
	}

	@JsonProperty("label")
	public void setLabel(String label) {
		this.label = label;
	}

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}
}
