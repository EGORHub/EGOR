<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sj:head jqueryui="true" jquerytheme="cupertino" />
<sj:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page2</title>
</head>
<body>
	<h2>Here are your options</h2>
	<br />

	<div style="font-size: 18px">
		Start Time: <b><s:property
				value="slide2Model.userDefinedAttribute.startTime.startTime" /></b> <br />
		End Time: <b><s:property
				value="slide2Model.userDefinedAttribute.endTime.endTime" /></b> <br />
		Start Location: <b><s:property
				value="slide2Model.userDefinedAttribute.startLocation" /></b> <br />
		End Location: <b><s:property
				value="slide2Model.userDefinedAttribute.endLocation" /></b> <br />
		Overall Budget: <b><s:property
				value="slide2Model.userDefinedAttribute.overallBudget" /> Rs. </b><br />
		<br /> <br />

		<sj:tabbedpanel id="groups" selectedTab="1" show="true" hide="'fade'"
			sortable="true" cssStyle="height:450px; width:95%">
			<s:iterator value="slide2Model.sortedGroupMap.entrySet()">
				<s:set var="groupSize" value="%{slide2Model.sortedGroupMap.size()}">
				</s:set>
				<s:set var="tabwidth" value="%{99/#groupSize}">
				</s:set>
				<sj:tab target="%{value.groupName}" label="%{value.groupName}"
					cssStyle="width:%{tabwidth}%; height:100%"></sj:tab>

				<div id="${value.groupName}" style="width: 95%; height: 100%">

					<div id="filters" style="float: left; width: 30% height:100%">
						<s:iterator value="value.sortedFilterTypeMap.entrySet()">
							<s:if
								test="value.filterEnum.filterTypeEnum==@com.egor.service.model.slide2.FilterTypeEnum@SLIDER">
								<s:property value="value.filterEnum.filterName" />
								<br />
								<sj:slider min="value.startValue" max="value.endValue" step="1"
									value="{value.defaultStartValue,value.defaultEndValue}"
									cssStyle="width: 200px; margin: 10px;"></sj:slider>
							</s:if>
							<s:elseif
								test="value.filterEnum.filterTypeEnum==@com.egor.service.model.slide2.FilterTypeEnum@CHECKBOX">
								<s:property value="value.filterEnum.filterName" />
								<br />
								<sj:checkboxlist label="%{value.filterEnum.filterName}"
									name="checkbox" list="value.values" value="value.defaultValues"
									tooltip="Checkbox" />
							</s:elseif>
							<s:elseif
								test="value.filterEnum.filterTypeEnum==@com.egor.service.model.slide2.FilterTypeEnum@RADIOBOX">
								<s:property value="value.filterEnum.filterName" />
								<br />
								<s:form id="form">
									<sj:radio id="%{value.filterEnum.filterName}"
										list="value.values"></sj:radio>
								</s:form>
							</s:elseif>
							<s:elseif
								test="value.filterEnum.filterTypeEnum==@com.egor.service.model.slide2.FilterTypeEnum@DROPDOWN">
								<s:property value="value.filterEnum.filterName" />
								<br />
								<s:form id="form">
									<sj:select id="dropdown" list="value.values"></sj:select>
								</s:form>
							</s:elseif>
							<br />
						</s:iterator>
					</div>

					<div id="locations" style="float: right; width:50%" >
						<s:iterator value="value.sortedLocationMap.entrySet()">
							<sj:accordion collapsible="true" active="false" animate="true" onchange="true">
								<sj:accordionItem title="%{value.name}">
								Address <s:property value="value.address" />
								Contact <s:property value="value.phoneNumber" />
								Rating <s:property value="value.rating" />
								</sj:accordionItem>
							</sj:accordion>
						</s:iterator>
					</div>

				</div>
			</s:iterator>
		</sj:tabbedpanel>
	</div>
</body>
</html>