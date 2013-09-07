package com.egor.service.model.common;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TimeDetail {
	private Date startTime;
	private Date endTime;
	private Long duration;
	
	public TimeDetail(Date startTime, Date endTime, Long duration) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Long getDuration() {
		if(duration == null) {
			return (endTime.getTime()-startTime.getTime());
		}
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
