package com.jtudy.designpatterns.mediatorpattern;

public class User {

	private String name;
	private String message;	
	
	public User(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

	public void sendMessage() {
		MessageMediator.displayMessage(message, this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
		
}
