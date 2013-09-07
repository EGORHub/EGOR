package com.egor.service.model.slide2;

import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class RadioBox extends FilterType {

	private Map<Integer,String> valuesMap;
	private String defaultValue;

	public Map<Integer,String> getValues() {
		return valuesMap;
	}
	public void setValues(Map<Integer,String> valuesMap) {
		this.valuesMap = valuesMap;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
