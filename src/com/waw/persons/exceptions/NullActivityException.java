package com.waw.persons.exceptions;

import com.waw.persons.Person;

public class NullActivityException extends ActivityException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5416003116545864404L;

	public NullActivityException() {
		super("This person's activity cannot be set to null !");
	}
	
	
	public NullActivityException(Person current) {
		super(current.getName() + "'s activity cannot be set to null !");
	}
		
}
