package com.jtudy.designpatterns.builderpattern;

public class PatternClient {

	public static void main(String[] args) {
		
		User user = new UserBuilder().setName("John").setSurname("Mohn").setAge(29).build();
	}
}
