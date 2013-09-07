package com.egor.service.model.slide2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public enum GroupEnum {
	EAT ("Eat"),
	SPORTS ("Sports"),
	MOVIE ("movie");
	
	private String groupName;
	
	private GroupEnum(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
