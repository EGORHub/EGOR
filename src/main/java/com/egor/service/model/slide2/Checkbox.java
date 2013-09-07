package com.egor.service.model.slide2;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Checkbox extends FilterType {
	private List<String> values;
	private List<String> defaultValues;

	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
	public List<String> getDefaultValues() {
		return defaultValues;
	}
	public void setDefaultValues(List<String> defaultValues) {
		this.defaultValues = defaultValues;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
