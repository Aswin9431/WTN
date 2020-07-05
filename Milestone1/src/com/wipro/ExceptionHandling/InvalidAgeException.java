package com.wipro.ExceptionHandling;

public class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		super();
		System.out.println("Invalid age");
	}
}