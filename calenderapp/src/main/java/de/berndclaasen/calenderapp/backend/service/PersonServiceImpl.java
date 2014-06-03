package de.berndclaasen.calenderapp.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.berndclaasen.calenderapp.backend.dao.PersonDao;
import de.berndclaasen.calenderapp.backend.model.Person;


@Service("personService")
public class PersonServiceImpl implements PersonService{


	@Autowired
	private PersonDao personDao;
	
	@Transactional
	public void persistPerson(Person person) {
		personDao.create(person);
		
	}


	@Transactional
	public void updatePerson(Person person) {
		personDao.update(person);
		
	}

	@Transactional
	public Person findPersonById(long id) {
		return personDao.findOne(id);
	}
	
	
	@Transactional
	public List<Person> findAll() {
		return personDao.findAll();
	}
	


	@Transactional
	public void deletePerson(Person person) {
		personDao.delete(person);
		
	}

}
