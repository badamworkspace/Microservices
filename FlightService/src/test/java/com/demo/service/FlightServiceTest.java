package com.demo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.Model.Flight;
import com.demo.repo.FlightRepo;

class FlightServiceTest {
	
	private FlightRepo repo=mock(FlightRepo.class);
	
	private FlightService service=new FlightService(repo);
	
	private Flight flight=new Flight(1, "jazz", "Hyderabad", "chennai", "11-11-2021", "10:00", "11-11-2021", "11:00", "A320", "Veg", "Active", "1000");
	@Test
	void testCreateFlight() {
		
		when(repo.save(flight)).thenReturn(flight);
		assertEquals("Flight with number "+flight.getFlightNumber() +" created",service.createFlight(flight).getBody());
		
	}

	@Test
	void testViewFlights() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByStartDate() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByPost() {
		fail("Not yet implemented");
	}

	@Test
	void testFindById() {
		fail("Not yet implemented");
	}

}
