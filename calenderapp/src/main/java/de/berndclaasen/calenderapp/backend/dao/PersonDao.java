package de.berndclaasen.calenderapp.backend.dao;

import java.util.List;

import de.berndclaasen.calenderapp.backend.model.Person;

public interface PersonDao {
	
	  void persistPerson(Person person);
	  
	  Person findPersonById(long id);
	  
	  void updatePerson(Person person);
	  
	  void deletePerson(Person person);
	  
	  List<Person> findAll();
	  
}
