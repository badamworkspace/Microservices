package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.Model.Flight;
import com.demo.exception.NoFlightsException;
import com.demo.repo.FlightRepo;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepo repo;
	
	public ResponseEntity<String> createFlight(Flight flight){
		Flight res = repo.save(flight);
		return new ResponseEntity<String>("Flight with number "+res.getFlightNumber()+" created", HttpStatus.CREATED);
	}

	public ResponseEntity<List<Flight>> viewFlights() {
		List<Flight> flightList=repo.findAll();
		//if(flightList==null) throw new NoFlightsException();
		return new ResponseEntity<>(flightList, HttpStatus.OK);
	}

	public ResponseEntity<List<Flight>> findByStartDate(String startDate) {
		List<Flight> res = repo.findByStartDate(startDate);
		return new ResponseEntity<List<Flight>>(res,HttpStatus.OK);
	}

	public List<Flight> fingByPost(String fromPlace, String toPlace, String startDate) {
		// TODO Auto-generated method stub
		return repo.findFlights(fromPlace, toPlace, startDate);
	}

}
