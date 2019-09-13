package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * InMemoryPersonAccess
 */
@Repository("redis")
public class InMemoryPersonAccess implements PersonDao {

	private static final String USER_KEY = "USER";

	private HashOperations<String, UUID, Person> hashOperations;

	private RedisTemplate<String, Object> redisTemplate;

	private static List<Person> MOCK_DB = new ArrayList<>();

	public InMemoryPersonAccess(RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
		this.hashOperations = this.redisTemplate.opsForHash();
	}

	@Override
	public int insertPerson(UUID id, Person person) {
		try {
			System.out.println(id + " : " + person.getFirstName());
			hashOperations.put(USER_KEY, id, person);
			return 1; // assume always success
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Person> selectAllPeople() {
		return hashOperations.values(USER_KEY);
	}

	@Override
	public Optional<Person> selectPersonById(UUID uuid) {
		return Optional.ofNullable(hashOperations.get(USER_KEY, uuid));
	}

	@Override
	public int updatePersonById(UUID uuid, Person personToUpdate) {
		// Get old person data first
		boolean isHasOldData = selectPersonById(uuid).isPresent();

		// Map the Optional<Person> Object to int!!
		return selectPersonById(uuid).map(p -> {
			if (isHasOldData) {
				personToUpdate.setId(uuid);
				insertPerson(uuid, personToUpdate);
				return 1;
			}
			return 0;
		}).orElse(0);
	}

	@Override
	public int deletePersonById(UUID uuid) {
		Optional<Person> mayBeAPerson = selectPersonById(uuid);
		if (mayBeAPerson.isPresent()) {
			hashOperations.delete(USER_KEY, uuid);
			return 1;
		}
		return 0;
	}

}