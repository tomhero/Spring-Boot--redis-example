package com.example.demo.model;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

/**
 * Person
 */
public class Person implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private UUID id;
	@NotBlank
	private final String firstName;
	@NotBlank
	private final String lastName;
	private final int age;

	public Person(@JsonProperty("id") UUID id,
				  @JsonProperty("fname") String firstName,
				  @JsonProperty("lname") String lastName,
				  @JsonProperty("age") int age
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

}