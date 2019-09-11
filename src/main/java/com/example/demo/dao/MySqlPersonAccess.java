package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Statement;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("mysql")
public class MySqlPersonAccess implements PersonDao {

	private static final String COLUMN_ID = "id";
	private static final String COLUMN_FIRST_NAME = "first_name";
	private static final String COLUMN_LAST_NAME = "last_name";
	private static final String COLUMN_AGE = "age";

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public MySqlPersonAccess(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertPerson(UUID id, Person person) {
		return 0;
	}

	@Override
	public int insertPerson(Person person) {
		return 0;
	}

	@Override
	public List<Person> selectAllPeople() {
		String sql = "SELECT BIN_TO_UUID(id) id, " +
				"first_name, " +
				"last_name, " +
				"age " +
				"FROM person;";
		return jdbcTemplate.query(sql, (resultSet, i) -> {
			UUID id = UUID.fromString(resultSet.getString(COLUMN_ID));
			String firstName = resultSet.getString(COLUMN_FIRST_NAME);
			String laseName = resultSet.getString(COLUMN_LAST_NAME);
			int age = resultSet.getInt(COLUMN_AGE);
			return new Person(id, firstName, laseName, age);
		});
	}

	@Override
	public Optional<Person> selectPersonById(UUID uuid) {
		return Optional.empty();
	}

	@Override
	public int updatePersonById(UUID uuid, Person person) {
		return 0;
	}

	@Override
	public int deletePersonById(UUID uuid) {
		return 0;
	}
}
