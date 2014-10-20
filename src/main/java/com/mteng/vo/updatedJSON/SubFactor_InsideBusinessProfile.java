package com.mteng.vo.updatedJSON;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
	"rating",
	"selected",
	"label",
	"options"
})

public class SubFactor_InsideBusinessProfile {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("rating")
	private Long rating;
	@JsonProperty("selected")
	private Long selected;
	@JsonProperty("label")
	private String label;
	@JsonProperty("options")
	private List<Option> options = new ArrayList<Option>();

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("rating")
	public Long getRating() {
		return rating;
	}

	@JsonProperty("rating")
	public void setRating(Long rating) {
		this.rating = rating;
	}

	@JsonProperty("selected")
	public Long getSelected() {
		return selected;
	}

	@JsonProperty("selected")
	public void setSelected(Long selected) {
		this.selected = selected;
	}

	@JsonProperty("label")
	public String getLabel() {
		return label;
	}

	@JsonProperty("label")
	public void setLabel(String label) {
		this.label = label;
	}

	@JsonProperty("options")
	public List<Option> getOptions() {
		return options;
	}

	@JsonProperty("options")
	public void setOptions(List<Option> options) {
		this.options = options;
	}
}