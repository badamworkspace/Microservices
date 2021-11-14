package com.demo.exception;

public class NoFlightsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoFlightsException() {
		
	}
	public NoFlightsException(String s) {
		super(s);
	}
}
