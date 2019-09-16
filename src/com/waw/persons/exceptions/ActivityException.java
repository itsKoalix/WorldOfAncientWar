package com.waw.persons.exceptions;

public class ActivityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4591224406672992419L;

	public ActivityException(String message) {
		super("\n" + message);
	}
}
