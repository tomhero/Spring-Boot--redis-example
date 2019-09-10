package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * PersonController
 */
@RequestMapping("api/v1/person")
@RestController
public class PersonController {

	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@PostMapping
	public void addPerson(@Valid @NotNull @RequestBody Person person) {
		personService.addNewPerson(person);
	}

	@GetMapping
	public List<Person> getAllPeople() {
		return personService.getAllPeople();
	}

	@GetMapping(path = "{id}")
	public Person getOnePersonById(@PathVariable("id") UUID id) {
		return personService.getPersonById(id)
			.orElse(null);
	}

	@PutMapping(path = "{id}")
	public void updateOneExistPerson(@Valid @NotNull @RequestBody Person person, @PathVariable("id") UUID id) {
		personService.updateOnePerson(id, person);
	}

	@DeleteMapping(path = "{id}")
	public void deleteOnePerson(@PathVariable("id") UUID id) {
		personService.deleteOnePerson(id);
	}

}