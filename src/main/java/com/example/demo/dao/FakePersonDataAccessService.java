package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

import org.springframework.stereotype.Repository;

/**
 * FakePersonDataAccessService
 */
@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

	private static List<Person> MOCK_DB = new ArrayList<>();

	@Override
	public int insertPerson(UUID id, Person person) {
		MOCK_DB.add(new Person(id, person.getFirstName(), person.getLastName(), person.getAge()));
		return 1; // assume always success
	}

	@Override
	public List<Person> selectAllPeople() {
		return MOCK_DB;
	}

	@Override
	public Optional<Person> selectPersonById(UUID uuid) {
		return MOCK_DB.stream().filter(person -> uuid.equals(person.getId())).findFirst();
	}

	@Override
	public int updatePersonById(UUID uuid, Person personToUpdate) {
		// Map the Optional<Person> Object to int!!
		return selectPersonById(uuid).map(p -> {
			int indexOfPersonToReplace = MOCK_DB.indexOf(p);
			if (indexOfPersonToReplace >= 0) {
				MOCK_DB.set(indexOfPersonToReplace, new Person(uuid, personToUpdate.getFirstName(),
						personToUpdate.getLastName(), personToUpdate.getAge()));
				return 1;
			}
			return 0;
		}).orElse(0);
	}

	@Override
	public int deletePersonById(UUID uuid) {
		Optional<Person> mayBeAPerson = selectPersonById(uuid);
		if (mayBeAPerson.isPresent()) {
			MOCK_DB.removeIf(person -> uuid.equals(person.getId()));
			return 1;
		}
		return 0;
	}

}