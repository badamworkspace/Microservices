package com.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class SearchResult {
	private long flightNumber;
	private String startDate;
	private String startTime;
	private String airline;
	private String price;
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
	
	public long getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public SearchResult(long flightNumber, String startDate, String startTime, String airline, String price,
			String toPlace, String fromPlace) {
		super();
		this.flightNumber = flightNumber;
		this.startDate = startDate;
		this.startTime = startTime;
		this.airline = airline;
		this.price = price;
		this.toPlace = toPlace;
		this.fromPlace = fromPlace;
	}
	public SearchResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
