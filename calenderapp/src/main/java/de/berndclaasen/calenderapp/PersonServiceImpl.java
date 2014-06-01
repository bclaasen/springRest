package de.berndclaasen.calenderapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("personService")
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao personDao;
	

	@Transactional
	public void persistPerson(Person person) {
		personDao.persistPerson(person);
		
	}


	@Transactional
	public void updatePerson(Person person) {
		personDao.updatePerson(person);
		
	}

	@Transactional
	public Person findPersonById(int id) {
		return personDao.findPersonById(id);
	}


	@Transactional
	public void deletePerson(Person person) {
		personDao.deletePerson(person);
		
	}

}
