package com.mteng.vo.dated;

import java.util.ArrayList;
import java.util.List;

public class SubFactor {

	private Long id;
	private Long rating;
	private Long selected;
	private String label;
	private List<Option> options = new ArrayList<Option>();

	public Long getId() {
		return id;
	}
	public Long getRating() {
		return rating;
	}
	public Long getSelected() {
		return selected;
	}
	public String getLabel() {
		return label;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setRating(Long rating) {
		this.rating = rating;
	}
	public void setSelected(Long selected) {
		this.selected = selected;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
}