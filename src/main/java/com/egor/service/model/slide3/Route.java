package com.egor.service.model.slide3;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Route {
	private TravelModeEnum overallTravelMode;
	List<RouteDetail> routeDetails;
	
	public TravelModeEnum getOverallTravelMode() {
		return overallTravelMode;
	}
	public void setOverallTravelMode(TravelModeEnum overallTravelMode) {
		this.overallTravelMode = overallTravelMode;
	}
	public List<RouteDetail> getRouteDetails() {
		return routeDetails;
	}
	public void setRouteDetails(List<RouteDetail> routeDetails) {
		this.routeDetails = routeDetails;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
