package com.egor.service.model.slide2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public enum FilterTypeEnum {
	CHECKBOX ("Checkbox"),
	SLIDER ("Slider"),
	RADIOBOX ("Radiobox"),
	DROPDOWN ("Dropdown");
	
	private String filterTypeName;
	
	private FilterTypeEnum(String filterTypeName) {
		this.filterTypeName = filterTypeName;
	}

	public String getFilterTypeName() {
		return filterTypeName;
	}

	public void setFilterTypeName(String filterTypeName) {
		this.filterTypeName = filterTypeName;
	}
	
	public boolean equals(FilterTypeEnum filterTypeEnum) {
		if(this.equals(filterTypeEnum)) {
			return true;
		}
		return false;
	}
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
