package com.egor.service.model.slide3;

import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.egor.service.model.common.UserDefinedAttribute;
import com.egor.service.utils.Pair;

public class Plan {

	private Map<Pair<PlanActivity, PlanActivity>, TravelDetail> planActivityTravelMap;
	private UserDefinedAttribute userDefinedAttribute;

	public Map<Pair<PlanActivity, PlanActivity>, TravelDetail> getPlanActivityTravelMap() {
		return planActivityTravelMap;
	}

	public void setPlanActivityTravelMap(
			Map<Pair<PlanActivity, PlanActivity>, TravelDetail> planActivityTravelMap) {
		this.planActivityTravelMap = planActivityTravelMap;
	}

	public UserDefinedAttribute getUserDefinedAttribute() {
		return userDefinedAttribute;
	}

	public void setUserDefinedAttribute(
			UserDefinedAttribute userDefinedAttribute) {
		this.userDefinedAttribute = userDefinedAttribute;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
