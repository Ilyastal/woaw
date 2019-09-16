package com.waw.activities.civilian;

import com.waw.persons.Person;

public class Engineer extends Civilian {

	

	@Override
	public void work(Person current) {
		// TODO Auto-generated method stub
		System.out.println("Mon activité est : " + current.getActivity()  + " et l'accessoire utilisé actuellement est : " + current.getCurrent_accessory());
		
		
	}

}
