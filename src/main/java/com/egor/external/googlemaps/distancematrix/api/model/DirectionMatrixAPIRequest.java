package com.egor.external.googlemaps.distancematrix.api.model;

public class DirectionMatrixAPIRequest {
	String origins; // One or more addresses and/or textual latitude/longitude values, separated with the pipe (|) character, from which to calculate distance and time. If you pass an address as a string, the service will geocode the string and convert it to a latitude/longitude coordinate to calculate directions. If you pass coordinates, ensure that no space exists between the latitude and longitude values. 
	String destinations; //One or more addresses and/or textual latitude/longitude values, separated with the pipe (|) character, to which to calculate distance and time. If you pass an address as a string, the service will geocode the string and convert it to a latitude/longitude coordinate to calculate directions. If you pass coordinates, ensure that no space exists between the latitude and longitude values. 
	Boolean sensor;  // Indicates whether your application is using a sensor (such as a GPS locator) to determine the user's location. This value must be either true or false.
	TravelModeDirectionMatrix mode;
	String language ; 
	String avoid; //  avoid=tolls    avoid=highways
	String units; //   units=metric (default) returns distances in kilometers and meters.
    //units=imperial returns distances in miles and feet.
	
	public String getOrigins() {
		return origins;
	}
	public void setOrigins(String origins) {
		this.origins = origins;
	}
	public String getDestinations() {
		return destinations;
	}
	public void setDestinations(String destinations) {
		this.destinations = destinations;
	}
	public Boolean getSensor() {
		return sensor;
	}
	public void setSensor(Boolean sensor) {
		this.sensor = sensor;
	}
	public TravelModeDirectionMatrix getMode() {
		return mode;
	}
	public void setMode(TravelModeDirectionMatrix mode) {
		this.mode = mode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAvoid() {
		return avoid;
	}
	public void setAvoid(String avoid) {
		this.avoid = avoid;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	

	

}
