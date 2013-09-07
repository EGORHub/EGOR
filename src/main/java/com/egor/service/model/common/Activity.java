package com.egor.service.model.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.egor.service.model.slide2.Group;

public abstract class Activity {

	private int expense;
	private TimeDetail startTimeDetail;
	private TimeDetail endTimeDetail;
	private TimeDetail startWaitTimeDetail;
	private TimeDetail endWaitTimeDetail;
	private Group group;

	public int getExpense() {
		return expense;
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}

	public TimeDetail getStartTimeDetail() {
		return startTimeDetail;
	}

	public void setStartTimeDetail(TimeDetail startTimeDetail) {
		this.startTimeDetail = startTimeDetail;
	}

	public TimeDetail getEndTimeDetail() {
		return endTimeDetail;
	}

	public void setEndTimeDetail(TimeDetail endTimeDetail) {
		this.endTimeDetail = endTimeDetail;
	}

	public TimeDetail getStartWaitTimeDetail() {
		return startWaitTimeDetail;
	}

	public void setStartWaitTimeDetail(TimeDetail startWaitTimeDetail) {
		this.startWaitTimeDetail = startWaitTimeDetail;
	}

	public TimeDetail getEndWaitTimeDetail() {
		return endWaitTimeDetail;
	}

	public void setEndWaitTimeDetail(TimeDetail endWaitTimeDetail) {
		this.endWaitTimeDetail = endWaitTimeDetail;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
