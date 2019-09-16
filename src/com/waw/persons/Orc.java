package com.waw.persons;

import java.util.Arrays;
import java.util.List;

import com.waw.accessories.Accessory;
import com.waw.accessories.tool.Tool;
import com.waw.accessories.weapon.magic.MagicWeapon;
import com.waw.activities.Activity;
import com.waw.activities.civilian.Civilian;
import com.waw.persons.exceptions.ActivityException;
import com.waw.persons.exceptions.InvalidAccessoryException;

public class Orc extends Person {
	
	static {
		
		invalid_activities.put(Orc.class.getName(), Arrays.asList(
				Civilian.class.getName()
		));
		
		invalid_accessories.put(Orc.class.getName(), Arrays.asList(
				Tool.class.getName(),
				MagicWeapon.class.getName()
		));
	}
	
	/**
	 * 
	 */
	public Orc() {
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
	public Orc(String name, int lifepoints, Activity activity, List<Accessory> accessories) throws ActivityException, InvalidAccessoryException {
		super(name, lifepoints, activity, accessories);
		// TODO Auto-generated constructor stub
	}



	public void grunt() {
		System.out.println(this.getName() + " : Grgneugneuneunjnjkjl...");
	}
}
