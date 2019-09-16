package com.waw.activities.military.exceptions;

import com.waw.persons.Person;

public class NoCurrentWeaponException extends WeaponException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 613864581693789887L;

	
	
	public NoCurrentWeaponException() {
		super(
				"This fighter cannot fight !\n" +
				"He has not any weapon !\n" +
				"You must give a weapon to this fighter !");
	}

	public NoCurrentWeaponException(Person person) {
		super(
				person.getName() + " cannot fight !\n" +
				"He has not any weapon !\n" +
				"You must give a weapon to " + person.getName() + " !");
	}
	
	
}
