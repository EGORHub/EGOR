package com.egor.service.model.slide2;

import java.util.SortedMap;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.egor.service.model.common.UserDefinedAttribute;

public class Slide2Model {
	private SortedMap<Integer, Group> sortedGroupMap;
	private UserDefinedAttribute userDefinedAttribute;

	public SortedMap<Integer, Group> getSortedGroupMap() {
		return sortedGroupMap;
	}
	
	public void setSortedGroupMap(SortedMap<Integer, Group> sortedGroupMap) {
		this.sortedGroupMap = sortedGroupMap;
	}
	
	public UserDefinedAttribute getUserDefinedAttribute() {
		return userDefinedAttribute;
	}
	
	public void setUserDefinedAttribute(UserDefinedAttribute userDefinedAttribute) {
		this.userDefinedAttribute = userDefinedAttribute;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}

