package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * PersonService
 */
@Service
public class PersonService {

	private final PersonDao personDao;

	@Autowired
	public PersonService(@Qualifier("redis") PersonDao personDao) {
		this.personDao = personDao;
	}

	public int addNewPerson(Person person) {
		return personDao.insertPerson(person);
	}

	public List<Person> getAllPeople() {
		return personDao.selectAllPeople();
	}

	public Optional<Person> getPersonById(UUID id) {
		return personDao.selectPersonById(id);
	}

	public int deleteOnePerson(UUID id) {
		return personDao.deletePersonById(id);
	}

	public int updateOnePerson(UUID id, Person person) {
		return personDao.updatePersonById(id, person);
	}

}