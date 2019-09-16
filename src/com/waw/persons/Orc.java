package com.waw.persons;

import java.util.List;

import com.waw.accessories.Accessory;
import com.waw.accessories.weapon.melee.MeleeWeapon;
import com.waw.accessories.weapon.throwing.ThrowingWeapon;
import com.waw.activities.Activity;
import com.waw.activities.military.Military;

public class Orc extends Person {

	private int buff;


	public Orc() {
	
		// TODO Auto-generated constructor stub
	}



	public Orc(String name, Activity activity, int lifePoints, List<Accessory> accessories, Accessory current_accessory, int buff) {
		super(name, activity, buff, accessories, current_accessory);
		this.buff = buff;
	}





	public int getBuff() {
		return buff;
	}

	public void setBuff(int buff) {
		this.buff = buff;
	}

	//	La méthode void grunt() qui affiche un message (un grognement
	//			par exemple) et qui incrémente de 5 la variable int buff.
	public void grunt() {
		this.buff += 5;
		System.out.println("un grognement");
	}
	//	Une redéfinition de la méthode boolean
	//	checkActivityValidity(Activity activity). Cette méthode renvoie true
	//	si le paramètre Activity activity est une instance de Military. Sinon
	//
	//	elle renvoie false. Un Orc est en effet trop belliqueux pour être un
	//	civil...

	public boolean checkActivityValidity(Activity activity) {
		if (activity instanceof Military) {
			return true;
		}else {
			return false;
			
		}

		// adnan --> if (activity instanceof Military){
		// return activity instanceof Military;
	}
//	La redéfinition de la méthode boolean
//	checkAccessoryValidity(Accessory accessory). Cette méthode
//	renvoie true si le paramètre Accessory accessory est une instance
//	de MeleeWeapon ou ThrowingWeapon. Sinon elle renvoie false.
//	Un Orc n’utilise ni outil, ni magie. Ces êtres-là ne comprennent
//	que la force brute...
	
	public boolean checkaccessoryValidity (Accessory accessory) {
		if (accessory instanceof MeleeWeapon || accessory instanceof ThrowingWeapon ) {
			return true;	
		}else {
			return false;
		}
			
	
				
		
	}
}
