package com.waw.activities.military.exceptions;

public class WeaponException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2219163158417040124L;
	
	public WeaponException(String message) {
		super("\n" + message);
	}
}
