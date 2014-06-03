package de.berndclaasen.calenderapp.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.berndclaasen.calenderapp.backend.dao.PersonDao;
import de.berndclaasen.calenderapp.backend.generic.dao.IGenericDao;
import de.berndclaasen.calenderapp.backend.model.Person;


@Service("personService")
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao personDao;
	
	IGenericDao<Person> dao;

	@Autowired
	public void setDao(IGenericDao<Person> daoToSet) {
		dao = daoToSet;
		dao.setClazz(Person.class);
	}

	@Transactional
	public void persistPerson(Person person) {
		personDao.persistPerson(person);
		
	}


	@Transactional
	public void updatePerson(Person person) {
		personDao.updatePerson(person);
		
	}

	@Transactional
	public Person findPersonById(long id) {
		//return personDao.findPersonById(id);
		return dao.findOne(id);
	}
	
	@Transactional
	public List<Person> findAll() {
		return personDao.findAll();
	}


	@Transactional
	public void deletePerson(Person person) {
		personDao.deletePerson(person);
		
	}

}
