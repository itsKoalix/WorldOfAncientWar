package com.waw.activities.military;

import java.util.Random;

import com.waw.activities.military.exceptions.NoCurrentWeaponException;
import com.waw.persons.Person;

public class Archer extends Military {

	public int getTotalDamages(Person current) throws NoCurrentWeaponException {
		
		Random rand = new Random();
		
		boolean has_damage_buff = rand.nextBoolean();
		int damage_buff = (has_damage_buff ? 5 + rand.nextInt(10) : 0);
		if (damage_buff > 0)
			System.out.println(damage_buff + " buff damages ! ");
		return super.getTotalDamages(current) + damage_buff;
	}
}
