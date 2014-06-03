package de.berndclaasen.calenderapp.backend.dao;

import org.springframework.stereotype.Repository;

import de.berndclaasen.calenderapp.backend.generic.dao.GenericDaoImpl;
import de.berndclaasen.calenderapp.backend.model.Person;


@Repository("personDao")
public class PersonDaoImpl extends GenericDaoImpl<Person> implements PersonDao {

}
