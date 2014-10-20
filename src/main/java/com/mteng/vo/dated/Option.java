package com.mteng.vo.dated;

public class Option {

	private Long id;
	private Long value;
	private String label;
	private Boolean isSelected;

	public Long getId() {
		return id;
	}
	public Long getValue() {
		return value;
	}
	public String getLabel() {
		return label;
	}
	public Boolean getIsSelected() {
		return isSelected;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}
}
