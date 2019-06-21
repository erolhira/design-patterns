package com.jtudy.designpatterns.singletonpattern;

public class SingletonObject {

	private static SingletonObject singletonObject;
	
	private SingletonObject() { }
	
	public static SingletonObject getInstance() {
		if(singletonObject == null) {
			synchronized (SingletonObject.class) {
				if(singletonObject == null) {					
					singletonObject = new SingletonObject();
				}
			}
		}
		return singletonObject;
	}
	
	public void print() {
		System.out.println("this is from thread-safe-accessed lazy singleton.");
	}
}
