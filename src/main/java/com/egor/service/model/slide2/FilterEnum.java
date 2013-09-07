package com.egor.service.model.slide2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public enum FilterEnum {
	CUISINE("Cuisine", GroupEnum.EAT, FilterTypeEnum.CHECKBOX, "Eat_Details","cuisine"), 
	DISTANCE("Distance", GroupEnum.EAT, FilterTypeEnum.SLIDER, "Eat_Details", "cuisine"),
	TIME("Time", GroupEnum.MOVIE, FilterTypeEnum.DROPDOWN, "", ""),
	AGE("Age",GroupEnum.MOVIE,FilterTypeEnum.RADIOBOX,"","");
	

	private String filterName;
	private GroupEnum groupEnum;
	private FilterTypeEnum filterTypeEnum;
	// TODO: remove tableName and columnName, use reflection
	private String tableName;
	private String columnName;

	private FilterEnum(String filterName, GroupEnum groupEnum,
			FilterTypeEnum filterTypeEnum, String tableName, String columnName) {
		this.filterName = filterName;
		this.groupEnum = groupEnum;
		this.filterTypeEnum = filterTypeEnum;
		this.tableName = tableName;
		this.columnName = columnName;
	}

	public String getFilterName() {
		return filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	public GroupEnum getGroupEnum() {
		return groupEnum;
	}

	public void setGroupEnum(GroupEnum groupEnum) {
		this.groupEnum = groupEnum;
	}

	public FilterTypeEnum getFilterTypeEnum() {
		return filterTypeEnum;
	}

	public void setFilterTypeEnum(FilterTypeEnum filterTypeEnum) {
		this.filterTypeEnum = filterTypeEnum;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.SIMPLE_STYLE);
	}
}
