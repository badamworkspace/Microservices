package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Model.Flight;
import com.demo.Model.SearchModel;
import com.demo.Model.SearchResult;
import com.demo.exception.NoFlightsException;
import com.demo.service.FlightService;

@RestController
@RequestMapping("/api/v1.0/")
public class FlightController {
	@Autowired
	private FlightService flightService;
	
	@PostMapping("/airlines")
	public ResponseEntity<String> createFlight(@RequestBody Flight flight){
		return flightService.createFlight(flight);
	}
	@PutMapping("/airlines")
	public ResponseEntity<String> updateFlight(@RequestBody Flight flight){
		return flightService.updateFlight(flight);
	}
	
	@GetMapping("/airlines")
	public ResponseEntity<List<SearchResult>> viewAllFlights(){
		return flightService.viewFlights();
	}
	
	@GetMapping("/airlines/{startDate}")
	public ResponseEntity<List<SearchResult>> viewFlightsByStartDate(@PathVariable String startDate){
		return flightService.findByStartDate(startDate);
	}
	
	@GetMapping("/airline/{flightNumber}")
	public Optional<Flight> viewFlightsById(@PathVariable long flightNumber){
		return flightService.findById(flightNumber);
	}
	
	@PostMapping("/flight/search")
	public ResponseEntity<List<SearchResult>> viewFlightsByPost(@RequestBody SearchModel s){
		return flightService.findByPost(s.getFromPlace(),s.getToPlace(),s.getStartDate());
	}

}
