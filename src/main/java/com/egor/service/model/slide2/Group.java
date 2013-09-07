package com.egor.service.model.slide2;

import java.util.SortedMap;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.egor.service.model.common.Location;

public class Group {

	private String groupName;
	private SortedMap<Integer, FilterType> sortedFilterTypeMap;
	private SortedMap<Integer, Location> sortedLocationMap;

	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public SortedMap<Integer, FilterType> getSortedFilterTypeMap() {
		return sortedFilterTypeMap;
	}
	public void setSortedFilterTypeMap(
			SortedMap<Integer, FilterType> sortedFilterTypeMap) {
		this.sortedFilterTypeMap = sortedFilterTypeMap;
	}
	public SortedMap<Integer, Location> getSortedLocationMap() {
		return sortedLocationMap;
	}
	public void setSortedLocationMap(SortedMap<Integer, Location> sortedLocationMap) {
		this.sortedLocationMap = sortedLocationMap;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
