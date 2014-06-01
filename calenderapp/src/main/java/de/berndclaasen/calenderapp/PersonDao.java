package de.berndclaasen.calenderapp;

public interface PersonDao {
	
	  void persistPerson(Person person);
	  
	  Person findPersonById(int id);
	  
	  void updatePerson(Person person);
	  
	  void deletePerson(Person person);
	  
}
