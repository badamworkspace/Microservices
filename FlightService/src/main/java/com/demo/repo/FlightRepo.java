package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import com.demo.Model.Flight;
import com.demo.Model.SearchResult;

public interface FlightRepo extends JpaRepository<Flight, Long> {

	List<Flight> findByStartDate(String startDate);
	
	@Query(value = "Select * from Flight where from_place=?1 and to_place=?2 and start_date=?3",nativeQuery = true)
    List<Flight> findFlights( String fromPlace, String toPlace, String startDate);
	

}
