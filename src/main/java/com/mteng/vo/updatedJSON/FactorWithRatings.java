package com.mteng.vo.updatedJSON;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "id",
    "rating",
    "label"
})
public class FactorWithRatings {
    @JsonProperty("id")
	private Long id;

    @JsonProperty("rating")
	private Long rating;

    @JsonProperty("label")
	private String label;

    @JsonProperty("rating")
	public Long getRating() {
		return rating;
	}

    @JsonProperty("rating")
	public void setRating(Long rating) {
		this.rating = rating;
	}

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