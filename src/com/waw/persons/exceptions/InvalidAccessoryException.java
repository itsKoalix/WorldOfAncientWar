package com.waw.persons.exceptions;

import com.waw.accessories.Accessory;
import com.waw.persons.Person;

public class InvalidAccessoryException extends AccessoryException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2504376768515149844L;


	public InvalidAccessoryException() {
		super("Invalid activity for this person !");
	}
	
	public InvalidAccessoryException(Person person, Accessory accessory) {
		super(accessory.getClass().getSimpleName() + " is an invalid accessory for " + person.getClass().getSimpleName() + " !");
	}
}
