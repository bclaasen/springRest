package de.berndclaasen.calenderapp.backend.service;

import java.util.List;

import de.berndclaasen.calenderapp.backend.model.Person;

public interface PersonService {
	 
	    void persistPerson(Person person);
	 
	    Person findPersonById(long id);
	 
	    void updatePerson(Person person);
	 
	    void deletePerson(Person person);
	    
	    List<Person> findAll();
}