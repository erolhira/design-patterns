package com.jtudy.designpatterns.mediatorpattern;

public class MessageMediator {
	
	public static void displayMessage(String message, User user) {
		System.out.println(message + " is displayed for " + user.getName());
	}
}
