package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.logging.Logger;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

import org.apache.logging.log4j.util.MessageSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.*;
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

	@Cacheable(value = "person", unless = "#result==null or #result.size()==0")
	public List<Person> getAllPeople() {
		log.info("Get ALL person from mysql DB");
		return personDao.selectAllPeople();
	}

	@Cacheable(value = "person", key = "#id", unless = "#result==null")
	public Optional<Person> getPersonById(UUID id) {
		log.info("Get person from id : " + id.toString());
		return personDao.selectPersonById(id);
	}

	//	@CachePut(value = "person", key = "#id")
	public int updateOnePerson(UUID id, Person person) {
		log.info("Update person from id : " + id.toString());
		return personDao.updatePersonById(id, person);
	}

	@CacheEvict(value = "person", allEntries = true)
	public int deleteOnePerson(UUID id) {
		log.warning("Delete person from id : " + id.toString());
		return personDao.deletePersonById(id);
	}

}