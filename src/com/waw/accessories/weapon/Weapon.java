package com.waw.accessories.weapon;

import com.waw.accessories.Accessory;

public abstract class Weapon implements Accessory {
	
	public int damages;

	/**
	 * @return the damages
	 */
	public int getDamages() {
		return damages;
	}

	/**
	 * @param damages the damages to set
	 */
	public void setDamages(int damages) {
		this.damages = damages;
	}
	
	
}
