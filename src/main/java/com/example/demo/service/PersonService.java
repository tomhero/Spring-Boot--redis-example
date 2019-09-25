package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

/**
 * PersonService
 */
@Service
@EnableCaching
public class PersonService {

	private final PersonDao personDao;

	private static final Logger log = Logger.getLogger(PersonService.class.getName());

	@Autowired
	public PersonService(@Qualifier("mysql") PersonDao personDao) {
		this.personDao = personDao;
	}

	public int addNewPerson(Person person) {
		return personDao.insertPerson(person);
	}

	public List<Person> getAllPeople() {
		return personDao.selectAllPeople();
	}

	@Cacheable(value = "person", key = "#id", unless = "#result==null")
	public Optional<Person> getPersonById(UUID id) {
		log.info("Get person from id : " + id.toString());
		return personDao.selectPersonById(id);
	}

	public int deleteOnePerson(UUID id) {
		return personDao.deletePersonById(id);
	}

	public int updateOnePerson(UUID id, Person person) {
		return personDao.updatePersonById(id, person);
	}

}