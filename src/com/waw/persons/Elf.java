package com.waw.persons;

import com.waw.accessories.Accessory;
import com.waw.accessories.weapon.melee.MeleeWeapon;
import com.waw.accessories.weapon.throwing.ThrowingWeapon;
import com.waw.activities.Activity;
import com.waw.activities.military.Military;
import com.waw.activities.military.Swordman;

public class Elf extends Person {

	
	public void singUnderATree() {
		super.setLifePoints(lifePoints += 3);
		System.out.println("hello!!!!!!!!!!!!!!!!!");
	}
	
//	En reprenant le même principe que pour les Orcs, faire en sorte
//	qu’un Elf ne puisse ni avoir l’attribut Activity activity de type
//	Swordman, ni avoir dans les éléments de List<Accessory>
//	accessories un Accessory accessory de type MeleeWeapon. Un elfe
//	est bien trop délicat (et lâche hum.. hum..) pour se lancer dans un
//	corps à corps...
	
	
	public boolean checkActivityValidity(Activity activity) {
		if (activity instanceof Swordman) {
			return true;
		}else {
			return false; 
		}
	}
		public boolean checkaccessoryValidity (Accessory accessory) {
			if (accessory instanceof MeleeWeapon ) {
				return true;	
			}else {
				return false;
			}
	
		}
}