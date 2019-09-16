package com.waw.persons.exceptions;

import com.waw.activities.Activity;
import com.waw.persons.Person;

public class InvalidActivityException extends ActivityException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4139078034588816714L;
	
	public InvalidActivityException() {
		super("Invalid activity for this person !");
	}
	
	public InvalidActivityException(Person person, Activity activity) {
		super(activity.getClass().getSimpleName() + " is an invalid activity for " + person.getClass().getSimpleName() + " !");
	}
}
