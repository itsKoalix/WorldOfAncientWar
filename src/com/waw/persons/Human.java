package com.waw.persons;

import java.util.List;

import com.waw.accessories.Accessory;
import com.waw.activities.Activity;
import com.waw.persons.exceptions.ActivityException;
import com.waw.persons.exceptions.InvalidAccessoryException;

public class Human extends Person {

	/**
	 * 
	 */
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param lifepoints
	 * @param activity
	 * @param accessories
	 * @throws InvalidAccessoryException 
	 * @throws NullActivityException 
	 */
	public Human(String name, int lifepoints, Activity activity, List<Accessory> accessories) throws ActivityException, InvalidAccessoryException {
		super(name, lifepoints, activity, accessories);
		// TODO Auto-generated constructor stub
	}

}
