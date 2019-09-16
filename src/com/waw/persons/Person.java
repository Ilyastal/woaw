package com.waw.persons;

import java.util.List;

import com.waw.accessories.Accessory;
import com.waw.accessories.tool.Tool;
import com.waw.accessories.weapon.Weapon;
import com.waw.activities.Activity;
import com.waw.activities.civilian.Civilian;
import com.waw.activities.military.Military;

public abstract class Person {

	private String name;
	private Activity activity;
	protected int lifePoints;
	private List<Accessory> accessories;
	private Accessory current_accessory;
	
	public Person() {
		
		
	}
//	
//	Faire en sorte que votre constructeur paramétré utilisent les
//	méthodes void setActivity(Activity activity) et void
//	setAccessories(List<Accessory> accessories).
	

	public Person(String name, Activity activity, int lifePoints, List<Accessory> accessories,
		Accessory current_accessory) {
	super();
	this.name = name;
	this.setActivity(activity);
	this.lifePoints = lifePoints;
	this.setAccessories(accessories);
	this.current_accessory = current_accessory;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		if (checkActivityValidity(activity) ) {
			this.activity = activity;
		}
		if (activity == null) {
				this.accessories.clear();
		}
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
		
	}
	public List<Accessory> getAccessories() {
		return accessories;
	}
//	Faire en sorte que le setter void setAccessories(List<Accessory>
//	accessories) ne puissent ajouter les éléments du paramètre
//	List<Accessory> accessories qu’en passant par la méthode void
//	addAccessory.
	
	public void setAccessories(List<Accessory> accessories) {
		
		for (Accessory acc : accessories) {
			this.addAccessory(acc);	
		}
				
	}
	public Accessory getCurrent_accessory() {
		return current_accessory;
	}
	
//	Faire en sorte que le setter void setCurrentAccessory(Accessory
//			accessory) ne puisse changer l’attribut Accessory
//			current_accessory, uniquement si le paramètre Accessory
//			accessory de la méthode est un Accessory accessory contenu dans
//			l’attribut List<Accessory> accessories.
	
	public void setCurrent_accessory(Accessory current_accessory) {
		if (this.accessories.contains(current_accessory)) {
		this.current_accessory = current_accessory;
		}
	}
	
	public boolean checkActivityValidity(Activity activity) {
		if (activity instanceof Civilian || activity instanceof Military) {
			return true;
		}else {
			return false;
		}
		
	}
	public boolean checkaccessoryValidity (Accessory accessory) {
		if( accessory instanceof Tool || accessory instanceof Weapon) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void addAccessory(Accessory accessory) {
		
		if( checkaccessoryValidity(accessory)  && activity != null) {
			
			this.accessories.add(accessory);
		}else {
			System.out.println("Ajouter une activity pour ajouter un accessory!!!!!!!!!!!");
		}
	}
	
	
	
}
