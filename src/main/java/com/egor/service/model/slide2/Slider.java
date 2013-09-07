package com.egor.service.model.slide2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Slider extends FilterType {
	private int startValue;
	private int endValue;
	private int defaultStartValue;
	private int defaultEndValue;

	public int getStartValue() {
		return startValue;
	}
	public void setStartValue(int startValue) {
		this.startValue = startValue;
	}
	public int getEndValue() {
		return endValue;
	}
	public void setEndValue(int endValue) {
		this.endValue = endValue;
	}
	public int getDefaultStartValue() {
		return defaultStartValue;
	}
	public void setDefaultStartValue(int defaultStartValue) {
		this.defaultStartValue = defaultStartValue;
	}
	public int getDefaultEndValue() {
		return defaultEndValue;
	}
	public void setDefaultEndValue(int defaultEndValue) {
		this.defaultEndValue = defaultEndValue;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
