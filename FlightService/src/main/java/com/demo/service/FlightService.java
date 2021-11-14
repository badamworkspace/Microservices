package com.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.Model.Flight;
import com.demo.Model.SearchResult;
import com.demo.exception.NoFlightsException;
import com.demo.repo.FlightRepo;

@Service
public class FlightService {
	
	
	private FlightRepo repo;
	
	@Autowired
	public FlightService(FlightRepo repo) {
		this.repo=repo;
	}

	public ResponseEntity<String> createFlight(Flight flight){
		Flight res = repo.save(flight);
		return new ResponseEntity<String>("Flight with number "+res.getFlightNumber()+" created", HttpStatus.CREATED);
	}

	public ResponseEntity<List<SearchResult>> viewFlights() {
		List<Flight> flightList=repo.findAll();
		List<SearchResult> res = flightList.stream().map((f)->flightToSearchResult(f)).collect(Collectors.toList());
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	private SearchResult flightToSearchResult(Flight f) {
		
		SearchResult searchRes=new SearchResult();
		searchRes.setAirline(f.getAirline());
		searchRes.setFlightNumber(f.getFlightNumber());
		searchRes.setFromPlace(f.getFromPlace());
		searchRes.setPrice(f.getPrice());
		searchRes.setStartDate(f.getStartDate());
		searchRes.setStartTime(f.getStartTime());
		searchRes.setToPlace(f.getToPlace());
		return searchRes;
	}

	public ResponseEntity<List<SearchResult>> findByStartDate(String startDate) {
		List<Flight> flightList=repo.findByStartDate(startDate);
		List<SearchResult> res = flightList.stream().map((f)->flightToSearchResult(f)).collect(Collectors.toList());
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	public ResponseEntity<List<SearchResult>> findByPost(String fromPlace, String toPlace, String startDate) {
		// TODO Auto-generated method stub
		List<Flight> flightList=repo.findFlights(fromPlace,toPlace,startDate);
		List<SearchResult> res = flightList.stream().filter((f)->f.getStatus().equals("Active")).map((f)->flightToSearchResult(f)).collect(Collectors.toList());
		return new ResponseEntity<List<SearchResult>>(res, HttpStatus.OK);
		
	}

	public Optional<Flight> findById(long flightNumber) {
		return repo.findById(flightNumber);
	}

	public ResponseEntity<String> updateFlight(Flight flight) {
		Flight res = repo.save(flight);
		return new ResponseEntity<String>("Flight with number "+res.getFlightNumber()+" updated", HttpStatus.ACCEPTED);
	}

}
