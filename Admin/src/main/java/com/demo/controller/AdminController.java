package com.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Flight;



@RestController
@CrossOrigin()
public class AdminController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

	@PostMapping("/airlines")
	public ResponseEntity<String> createFlight(@RequestBody Flight flight) throws URISyntaxException{
		  RestTemplate restTemplate = new RestTemplate();
		    final String baseUrl = "http://localhost:8082/api/v1.0/airlines/";
		    URI uri = new URI(baseUrl);  
		    HttpHeaders headers = new HttpHeaders();
		    headers.set("X-COM-PERSIST", "true");    
		    headers.set("X-COM-LOCATION", "India"); 
		    headers.set("Role", "Admin");
		 
		    HttpEntity<Flight> request = new HttpEntity<>(flight, headers);
		     
		    ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
		    return result;
	}
}
