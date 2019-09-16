package com.waw.accessories.weapon;

import com.waw.accessories.Accessory;

public abstract class Weapon implements Accessory {

		private int damage;

		public int getDamage() {
			return damage;
		}

		public void setDamage(int damage) {
			this.damage = damage;
		}
		
		
}
