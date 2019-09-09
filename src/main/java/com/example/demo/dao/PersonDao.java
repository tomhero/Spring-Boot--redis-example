package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

/**
 * PersonDao
 */
public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID uuid);

    int updatePersonById(UUID uuid, Person person);

    int deletePersonById(UUID uuid);

}