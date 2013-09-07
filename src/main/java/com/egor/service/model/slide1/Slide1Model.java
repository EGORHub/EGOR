package com.egor.service.model.slide1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.egor.service.model.common.UserDefinedAttribute;


public class Slide1Model {
	private String searchString;
	private UserDefinedAttribute userDefinedAttribute;

	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
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
