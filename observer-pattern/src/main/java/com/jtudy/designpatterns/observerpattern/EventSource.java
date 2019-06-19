package com.jtudy.designpatterns.observerpattern;

import java.util.Observable;

public class EventSource extends Observable {

	public void process() {
		//do some work
		Object doneWorkResponse = null;
		setChanged(); //this must be called for the observers to be notified via call to notifyObservers.
		notifyObservers(doneWorkResponse);
	}
}
