package com.demo.contollerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.exception.NoFlightsException;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(NoFlightsException.class)
	public ResponseEntity<String> noFlightException(String s){
		return new ResponseEntity<String>(s, HttpStatus.OK);
	}

}
