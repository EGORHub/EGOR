package com.egor.service.model.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class UserDefinedAttribute {
	private TimeDetail startTime;
	private TimeDetail endTime;
	private String startLocation;
	private String endLocation;
	private int overallBudget;
	
	public TimeDetail getStartTime() {
		return startTime;
	}
	public void setStartTime(TimeDetail startTime) {
		this.startTime = startTime;
	}
	public TimeDetail getEndTime() {
		return endTime;
	}
	public void setEndTime(TimeDetail endTime) {
		this.endTime = endTime;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	public int getOverallBudget() {
		return overallBudget;
	}
	public void setOverallBudget(int overallBudget) {
		this.overallBudget = overallBudget;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}