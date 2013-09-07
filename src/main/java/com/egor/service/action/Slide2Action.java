package com.egor.service.action;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.collections.map.HashedMap;

import com.egor.service.model.common.Location;
import com.egor.service.model.common.TimeDetail;
import com.egor.service.model.common.UserDefinedAttribute;
import com.egor.service.model.slide2.Checkbox;
import com.egor.service.model.slide2.DropDown;
import com.egor.service.model.slide2.FilterEnum;
import com.egor.service.model.slide2.FilterType;
import com.egor.service.model.slide2.Group;
import com.egor.service.model.slide2.ProgressBar;
import com.egor.service.model.slide2.RadioBox;
import com.egor.service.model.slide2.Slide2Model;
import com.opensymphony.xwork2.ModelDriven;

public class Slide2Action implements ModelDriven<Slide2Model> {
	private Slide2Model slide2Model;

//	public String addUsers() {
//		User user1 = new User();
//		user1.setUserId(1);
//		user1.setUserName("ankur");
//		user1.setPassword("holycow!");
//		User user2 = new User();
//		user2.setUserId(2);
//		user2.setUserName("abhishek");
//		user2.setPassword("Shit!!!");
//		userList.add(user1);
//		userList.add(user2);
//		
//		return "success";
//	}
	
	
	public String makeDummySlide2Model() {
		slide2Model = new Slide2Model();
		slide2Model.setUserDefinedAttribute(getDummyUserDefinedAttribute());
		slide2Model.setSortedGroupMap(getDummySortedGroupMap());
		return "success";
	}
	
	private UserDefinedAttribute getDummyUserDefinedAttribute() {
		UserDefinedAttribute userDefinedAttribute = new UserDefinedAttribute();
		userDefinedAttribute.setEndLocation("Seelampur");
		userDefinedAttribute.setStartLocation("Pitampura");
		userDefinedAttribute.setOverallBudget(200);
		userDefinedAttribute.setEndTime(new TimeDetail(new Date(), new Date(), 100l));
		userDefinedAttribute.setStartTime(new TimeDetail(new Date(), new Date(), 100l));
		return userDefinedAttribute;
	}
	
	private SortedMap<Integer,Group> getDummySortedGroupMap() {
		SortedMap<Integer,Group> sortedGroupMap = new TreeMap<Integer, Group>();
		sortedGroupMap.put(1, getEatGroup());
		sortedGroupMap.put(2, getMovieGroup());
		return sortedGroupMap;
	}

	private Group getEatGroup() {
		Group eatGroup = new Group();
		eatGroup.setGroupName("Eat");
		eatGroup.setSortedFilterTypeMap(getDummyEatSortedFilterTypeMap());
		eatGroup.setSortedLocationMap(getDummyEatSortedLocationMap());
		return eatGroup;
	}
	
	private SortedMap<Integer,FilterType> getDummyEatSortedFilterTypeMap() {
		SortedMap<Integer,FilterType> sortedFilterTypeMap = new TreeMap<Integer, FilterType>();
		
		ProgressBar distanceFilter = new ProgressBar();
		distanceFilter.setFilterEnum(FilterEnum.DISTANCE);
		distanceFilter.setStartValue(0);
		distanceFilter.setEndValue(12);
		distanceFilter.setDefaultStartValue(2);
		distanceFilter.setDefaultEndValue(7);
		sortedFilterTypeMap.put(1, distanceFilter);
		
		Checkbox checkBoxFilter = new Checkbox();
		checkBoxFilter.setFilterEnum(FilterEnum.CUISINE);
		List<String> cuisines = Arrays.asList("Indian","Thai","Chinese","South Indian");
		List<String> defaultCuisines = Arrays.asList("Indian","Chinese");
		checkBoxFilter.setValues(cuisines);
		checkBoxFilter.setDefaultValues(defaultCuisines);
		
		sortedFilterTypeMap.put(1, distanceFilter);
		sortedFilterTypeMap.put(2, checkBoxFilter);
		return sortedFilterTypeMap;
	}
	
	private SortedMap<Integer,Location> getDummyEatSortedLocationMap() {
		SortedMap<Integer,Location> sortedLocationMap = new TreeMap<Integer, Location>();
		sortedLocationMap.put(1, getLocation("Bercos", "Metro Walk", "9891654565", "3.5"));
		sortedLocationMap.put(2, getLocation("Punjabi Rasoi", "Rohini", "9812345678", "2.5"));
		sortedLocationMap.put(3, getLocation("Mainland China", "Pitampura", "3812345678", "4"));
		sortedLocationMap.put(4, getLocation("Yo China!", "Seelampur", "999345678", "3"));
		sortedLocationMap.put(5, getLocation("Lotus Leaf", "Model Town", "9812348888", "2.5"));
		return sortedLocationMap;
	}
	
	private Group getMovieGroup() {
		Group movieGroup = new Group();
		movieGroup.setGroupName("Movie");
		movieGroup.setSortedFilterTypeMap(getDummyMovieSortedFilterTypeMap());
		movieGroup.setSortedLocationMap(getDummyMovieSortedLocationMap());
		return movieGroup;
	}
	
	private SortedMap<Integer,FilterType> getDummyMovieSortedFilterTypeMap() {
		SortedMap<Integer,FilterType> sortedFilterTypeMap = new TreeMap<Integer, FilterType>();
		
		ProgressBar distanceFilter = new ProgressBar();
		distanceFilter.setFilterEnum(FilterEnum.DISTANCE);
		distanceFilter.setStartValue(0);
		distanceFilter.setEndValue(20);
		distanceFilter.setDefaultStartValue(2);
		distanceFilter.setDefaultEndValue(18);
		
		DropDown dropDownFilter = new DropDown();
		dropDownFilter.setFilterEnum(FilterEnum.TIME);
		List<String> timesValues = Arrays.asList("00:00", "03:00", "06:00", "09:00", "12:00", "15:00", "18:00", "21:00");		
		dropDownFilter.setValues(timesValues);
		dropDownFilter.setDefaultValue("9:00");
		
		RadioBox radioBox = new RadioBox();
		radioBox.setFilterEnum(FilterEnum.AGE);
		Map<Integer,String> agesMap = new HashMap<Integer, String>();
		agesMap.put(1, "<10");
		agesMap.put(2, "11-20");
		agesMap.put(3, "21-40");
		agesMap.put(4, ">40");
		radioBox.setValues(agesMap);
		radioBox.setDefaultValue("11-20");
		
		sortedFilterTypeMap.put(1, distanceFilter);
		sortedFilterTypeMap.put(2, dropDownFilter);
		sortedFilterTypeMap.put(3, radioBox);
		return sortedFilterTypeMap;
	}
	
	private SortedMap<Integer,Location> getDummyMovieSortedLocationMap() {
		SortedMap<Integer,Location> sortedLocationMap = new TreeMap<Integer, Location>();
		sortedLocationMap.put(1, getLocation("PVR", "Metro Walk", "9891654565", "3.5"));
		sortedLocationMap.put(2, getLocation("M2K Cinemas", "Rohini", "9812345678", "2.5"));
		sortedLocationMap.put(3, getLocation("DT Cinemas", "Pitampura", "3812345678", "4"));
		sortedLocationMap.put(4, getLocation("Vishal", "Seelampur", "999345678", "3"));
		return sortedLocationMap;
	}
	
	private Location getLocation(String name, String address, String phoneNumber, String rating) {
		Location location = new Location();
		location.setName(name);
		location.setAddress(address);
		location.setPhoneNumber(phoneNumber);
		location.setRating(rating);
		return location;
	}
	
	public Slide2Model getModel() {
		return slide2Model;
	}

	public Slide2Model getSlide2Model() {
		return slide2Model;
	}

	public void setSlide2Model(Slide2Model slide2Model) {
		this.slide2Model = slide2Model;
	}

}
