package com.egor.service.model.slide3;

import java.util.SortedMap;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Slide3Model {

	private SortedMap<Integer, Plan> sortedPlanMap;

	public SortedMap<Integer, Plan> getSortedPlanMap() {
		return sortedPlanMap;
	}

	public void setSortedPlanMap(SortedMap<Integer, Plan> sortedPlanMap) {
		this.sortedPlanMap = sortedPlanMap;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
