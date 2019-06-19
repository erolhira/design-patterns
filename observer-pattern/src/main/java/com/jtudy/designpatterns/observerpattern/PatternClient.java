package com.jtudy.designpatterns.observerpattern;

public class PatternClient {

	public static void main(String[] args) {

		EventSource eventSource = new EventSource();
		
		EmailerObserver emailerObserver = new EmailerObserver();
		eventSource.addObserver(emailerObserver);
		
		LoggerObserver loggerObserver = new LoggerObserver(); 
		eventSource.addObserver(loggerObserver);
		
		eventSource.process();
	}

}
