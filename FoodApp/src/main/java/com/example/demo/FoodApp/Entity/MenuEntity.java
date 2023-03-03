package com.example.demo.FoodApp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MenuEntity {
private String breakfast;
public MenuEntity(String breakfast, String lunch, String dinner, String southIndian, String northIndian,
		String continental, String chinese, String spl) {
	super();
	this.breakfast = breakfast;
	this.lunch = lunch;
	this.dinner = dinner;
	this.southIndian = southIndian;
	this.northIndian = northIndian;
	this.continental = continental;
	this.chinese = chinese;
	this.spl = spl;
}
@Override
public String toString() {
	return "MenuModel [breakfast=" + breakfast + ", lunch=" + lunch + ", dinner=" + dinner + ", southIndian="
			+ southIndian + ", northIndian=" + northIndian + ", continental=" + continental + ", chinese=" + chinese
			+ ", spl=" + spl + "]";
}
public String getBreakfast() {
	return breakfast;
}
public void setBreakfast(String breakfast) {
	this.breakfast = breakfast;
}
public String getLunch() {
	return lunch;
}
public void setLunch(String lunch) {
	this.lunch = lunch;
}
public String getDinner() {
	return dinner;
}
public void setDinner(String dinner) {
	this.dinner = dinner;
}
public String getSouthIndian() {
	return southIndian;
}
public void setSouthIndian(String southIndian) {
	this.southIndian = southIndian;
}
public String getNorthIndian() {
	return northIndian;
}
public void setNorthIndian(String northIndian) {
	this.northIndian = northIndian;
}
public String getContinental() {
	return continental;
}
public void setContinental(String continental) {
	this.continental = continental;
}
public String getChinese() {
	return chinese;
}
public void setChinese(String chinese) {
	this.chinese = chinese;
}
public String getSpl() {
	return spl;
}
public void setSpl(String spl) {
	this.spl = spl;
}
private String lunch;
private String dinner;
private String southIndian;
private String northIndian;
private String continental;
private String chinese;
@JsonProperty("Today's Special")
private String spl;
}
