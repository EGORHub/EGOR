package com.egor.service.model.slide3;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.egor.service.model.common.TimeDetail;


public class RouteDetail {
	private String startLocation;
	private String endLocation;
	private String duration;
	private String expense;
	private TravelModeEnum travelMode;
	private TimeDetail waitingTimeAtStart;
	private TimeDetail waitingTimeAtEnd;
	
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getExpense() {
		return expense;
	}
	public void setExpense(String expense) {
		this.expense = expense;
	}
	public TravelModeEnum getTravelMode() {
		return travelMode;
	}
	public void setTravelMode(TravelModeEnum travelMode) {
		this.travelMode = travelMode;
	}
	public TimeDetail getWaitingTimeAtStart() {
		return waitingTimeAtStart;
	}
	public void setWaitingTimeAtStart(TimeDetail waitingTimeAtStart) {
		this.waitingTimeAtStart = waitingTimeAtStart;
	}
	public TimeDetail getWaitingTimeAtEnd() {
		return waitingTimeAtEnd;
	}
	public void setWaitingTimeAtEnd(TimeDetail waitingTimeAtEnd) {
		this.waitingTimeAtEnd = waitingTimeAtEnd;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}