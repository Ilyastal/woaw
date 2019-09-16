package com.waw.accessories.weapon.melee;
import com.waw.accessories.weapon.Weapon;

public abstract class MeleeWeapon extends Weapon{

	@Override
	public void setDamage(int damage) {
		
		super.setDamage(3);
	}
}
