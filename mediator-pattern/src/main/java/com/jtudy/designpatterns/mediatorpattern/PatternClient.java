package com.jtudy.designpatterns.mediatorpattern;

public class PatternClient {

	public static void main(String args[]) {
		
		User userA = new User("User A", "message A");
		User userB = new User("User B", "message B");
		
		userA.sendMessage();
		userB.sendMessage();
	}
}
