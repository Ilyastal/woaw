package com.waw.accessories.weapon.magic;
import com.waw.accessories.weapon.Weapon;

public abstract class MagicWeapon extends Weapon  {

	@Override
	public void setDamage(int damage) {
		
		super.setDamage(2);
	}
	
}
