package com.demo.Model;

public class SearchModel {
	private String startDate;
	private String toPlace;
	private String fromPlace;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public SearchModel(String startDate, String toPlace, String fromPlace) {
		super();
		this.startDate = startDate;
		this.toPlace = toPlace;
		this.fromPlace = fromPlace;
	}
	public SearchModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
