package com.egor.service.model.slide3;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TravelDetail {
	
	private List<Route> routes;
	
	public List<Route> getRoutes() {
		return routes;
	}
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
