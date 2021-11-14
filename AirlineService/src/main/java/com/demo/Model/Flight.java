package com.demo.Model;



import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Flight {
	@Id
	private long flightNumber;
	private String airline;
	private String fromPlace;
	private String toPlace;
	// pattern= "dd-MM-yyyy hh:mm a
	private String startDate;
	private String startTime;
	// pattern= "dd-MM-yyyy hh:mm a
	private String endDate;
	private String endTime;
	
	private String instrumentUsed;
	private String meal;
	public long getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getInstrumentUsed() {
		return instrumentUsed;
	}
	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}

	public Flight(long flightNumber, String airline, String fromPlace, String toPlace, String startDate,
			String startTime, String endDate, String endTime, String instrumentUsed, String meal) {
		super();
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startDate = startDate;
		this.startTime = startTime;
		this.endDate = endDate;
		this.endTime = endTime;
		this.instrumentUsed = instrumentUsed;
		this.meal = meal;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", airline=" + airline + ", fromPlace=" + fromPlace
				+ ", toPlace=" + toPlace + ", startDate=" + startDate + ", startTime=" + startTime + ", endDate="
				+ endDate + ", endTime=" + endTime + ", instrumentUsed=" + instrumentUsed + ", meal=" + meal + "]";
	}
	
}
