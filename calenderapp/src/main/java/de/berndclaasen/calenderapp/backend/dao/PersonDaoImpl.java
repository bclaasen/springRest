package de.berndclaasen.calenderapp.backend.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import de.berndclaasen.calenderapp.backend.model.Person;


@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;

	
	public void persistPerson(Person person) {
		sessionFactory.getCurrentSession().persist(person);
	}

	
	public Person findPersonById(long id) {
		return (Person) sessionFactory.getCurrentSession().get(Person.class, id);
	}

	
	public void updatePerson(Person person) {
		sessionFactory.getCurrentSession().update(person);

	}
	
	public void deletePerson(Person person) {
		sessionFactory.getCurrentSession().delete(person);
	}
	
	public List<Person> findAll(){
	      return sessionFactory.getCurrentSession().createQuery( "from Person" ).list();
	   }

}
