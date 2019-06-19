package com.jtudy.designpatterns.observerpattern;

import java.util.Observable;
import java.util.Observer;

public class LoggerObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {

		System.out.println("Logged..");
	}

	
}
