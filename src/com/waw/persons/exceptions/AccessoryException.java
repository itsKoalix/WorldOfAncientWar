package com.waw.persons.exceptions;

public class AccessoryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 414215385792509740L;

	public AccessoryException(String message) {
		super("\n" + message);
	}
	
}
