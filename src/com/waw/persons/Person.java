package com.waw.persons;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.waw.accessories.Accessory;
import com.waw.activities.Activity;
import com.waw.activities.military.Military;
import com.waw.persons.exceptions.ActivityException;
import com.waw.persons.exceptions.InvalidAccessoryException;
import com.waw.persons.exceptions.InvalidActivityException;
import com.waw.persons.exceptions.NullActivityException;

@SuppressWarnings("rawtypes")
public abstract class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3148610319992802666L;
	private String name;
	private int lifepoints;
	private Activity activity;
	public static Map<String, List<String>> invalid_activities;
	private List<Accessory> accessories;
	public static Map<String, List<String>> invalid_accessories;
	private Accessory current_accessory;
	
	static {
		invalid_activities = new TreeMap<>();
		invalid_accessories = new TreeMap<>();
	}
	
	{
		accessories = new ArrayList<Accessory>();
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name
	 * @param lifepoints
	 * @param activity
	 * @throws InvalidAccessoryException 
	 * @throws NullActivityException 
	 */
	public Person(String name, int lifepoints, Activity activity, List<Accessory> accessories) throws ActivityException, InvalidAccessoryException {
		this.setName(name);
		this.setLifepoints(lifepoints);
		this.setActivity(activity);
		this.setAccessories(accessories);
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lifepoints
	 */
	public int getLifepoints() {
		return lifepoints;
	}

	/**
	 * @param lifepoints the lifepoints to set
	 */
	public void setLifepoints(int lifepoints) {
		this.lifepoints = lifepoints;
	}

	/**
	 * @return the activity
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * @param activity the activity to set
	 * @throws NullActivityException 
	 */
	public void setActivity(Activity activity) throws ActivityException {
		
		if (activity == null) {
			throw new NullActivityException(this);
		}
		
		if (checkActivityValidity(activity))
			this.activity = activity;
		else
			throw new InvalidActivityException(this, activity);
		
		if (this.activity == null)
			this.accessories.clear();
	}

	public boolean checkActivityValidity(Activity activity) {
		
		if (Person.invalid_activities.get(this.getClass().getName()) == null)
			return true;
		
		for (String a : Person.invalid_activities.get(this.getClass().getName())) {
			try {
				if (Class.forName(a).isInstance(activity)) {
					return false;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return true;
	}

	/**
	 * @return the accessories
	 */
	public List<Accessory> getAccessories() {
		return accessories;
	}

	/**
	 * @param accessories the accessories to set
	 * @throws InvalidAccessoryException 
	 */
	public void setAccessories(List<Accessory> accessories) throws InvalidAccessoryException {
		
		if (accessories == null) return;
		
		for (Accessory accessory : accessories) {
			addAccessory(accessory);
		}
	}
	
	public void addAccessory(Accessory accessory) throws InvalidAccessoryException {
		
		if (checkAccessoryValidity(accessory)) {
			this.accessories.add(accessory);
			if (this.getCurrent_accessory() == null) {
				this.setCurrent_accessory(accessory);
			}
		}
		else
			throw new InvalidAccessoryException(this, accessory);
	}

	/**
	 * @return the current_accessory
	 */
	public Accessory getCurrent_accessory() {
		return current_accessory;
	}

	/**
	 * @param current_accessory the current_accessory to set
	 */
	public void setCurrent_accessory(Accessory current_accessory) {
		this.current_accessory = current_accessory;
	}

	public boolean checkAccessoryValidity(Accessory accessory) {
		
		if (Person.invalid_accessories.get(this.getClass().getName()) == null)
			return true;
		
		for (String a : Person.invalid_accessories.get(this.getClass().getName())) {
			try {
				if (Class.forName(a).isInstance(accessory)) {
					return false;
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	
	public boolean isAlive() {
		return this.getLifepoints() > 0;
	}


	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("========================\n");
		str.append("Description du personnage :\n");
		str.append(name + "\n");
		
		if (this.getActivity() != null)
			str.append("Activity : " + this.getActivity().getClass().getSimpleName() + "\n");
		
		str.append("Lifepoints : " + this.getLifepoints() + "\n");
		
		if (this.getAccessories() != null && this.getAccessories().size() > 0) {
			str.append("Accessories : " + "\n");
			for (Accessory accessory : accessories) {
				str.append("- " + accessory.getClass().getSimpleName() + "\n");
			}
		}
		str.append("========================\n");
		
		return str.toString();
	}
	
	
}
