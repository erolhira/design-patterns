package com.jtudy.designpatterns.builderpattern;

public class UserBuilder {

	private String name;
	private String surname;
	private Integer age;
	
	public UserBuilder() {}
	
	public UserBuilder(String name, String surname, Integer age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public UserBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public UserBuilder setSurname(String surname) {
		this.surname = surname;
		return this;
	}

	public UserBuilder setAge(Integer age) {
		this.age = age;
		return this;
	}
	
	public User build() {
		return new User(name, surname, age);
	}
}
