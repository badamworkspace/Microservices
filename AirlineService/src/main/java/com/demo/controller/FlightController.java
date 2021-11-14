package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Model.Flight;
import com.demo.Model.SearchModel;
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
	
	@GetMapping("/airlines")
	public ResponseEntity<List<Flight>> viewAllFlights(){
		return flightService.viewFlights();
	}
	
	@GetMapping("/airlines/{startDate}")
	public ResponseEntity<List<Flight>> viewFlightsByStartDate(@PathVariable String startDate){
		return flightService.findByStartDate(startDate);
	}
	
	@PostMapping("/flight/search")
	public List<Flight> viewFlightsByPost(@RequestBody SearchModel s){
		return flightService.fingByPost(s.getFromPlace(),s.getToPlace(),s.getStartDate());
	}

}
