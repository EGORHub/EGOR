package com.egor.service.model.slide2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class FilterType {
	private FilterEnum filterEnum;

	public FilterEnum getFilterEnum() {
		return filterEnum;
	}

	public void setFilterEnum(FilterEnum filterEnum) {
		this.filterEnum = filterEnum;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
