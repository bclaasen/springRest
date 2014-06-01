package de.berndclaasen.calenderapp;

public interface PersonService {
	 
	    void persistPerson(Person person);
	 
	    Person findPersonById(int id);
	 
	    void updatePerson(Person person);
	 
	    void deletePerson(Person person);	
}