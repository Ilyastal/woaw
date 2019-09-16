package com.waw.activities.military;
import com.waw.activities.Activity;
import com.waw.persons.Person;

public abstract class Military implements Activity {

	public abstract void attack(Person current, Person enemy );
}
