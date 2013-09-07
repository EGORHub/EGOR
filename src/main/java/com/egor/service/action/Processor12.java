package com.egor.service.action;

import java.util.Map.Entry;
import java.util.SortedMap;

import com.egor.service.model.common.Location;
import com.egor.service.model.slide1.Slide1Model;
import com.egor.service.model.slide2.FilterType;
import com.egor.service.model.slide2.Group;
import com.egor.service.model.slide2.Slide2Model;

public class Processor12 {

	public Slide2Model getSlide2ModelFromSlide1Model(Slide1Model slide1Model) {
		Slide2Model slide2Model = new Slide2Model();
		SortedMap<Integer, Group> sortedGroupMap = getSortedGroupMap(slide1Model);
		
		for(Entry<Integer, Group> key : sortedGroupMap.entrySet()) {
			Group group = sortedGroupMap.get(key);
			SortedMap<Integer, FilterType> sortedFilterTypeMap = getFilterTypeMapForGroup(group);
			group.setSortedFilterTypeMap(sortedFilterTypeMap);
			group.setSortedLocationMap(getLocationForGroup(group, sortedFilterTypeMap));
		}
		slide2Model.setSortedGroupMap(sortedGroupMap);
		slide2Model.setUserDefinedAttribute(slide1Model.getUserDefinedAttribute());
		return slide2Model;
	}

	private SortedMap<Integer, Group> getSortedGroupMap(Slide1Model slide1Model) {
		String groupName = slide1Model.getSearchString();
		return null;
	}

	private SortedMap<Integer, FilterType> getFilterTypeMapForGroup(Group group) {
		return null;

	}

	private SortedMap<Integer, Location> getLocationForGroup(Group group, SortedMap<Integer, FilterType> sortedFilterTypeMap) {
		return null;

	}
}
