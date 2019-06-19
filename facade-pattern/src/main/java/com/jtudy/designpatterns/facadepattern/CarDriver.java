package com.jtudy.designpatterns.facadepattern;

/*
 * Facade class
 */
public class CarDriver {

	private Car opel = new Opel();
	private Car suzuki = new Suzuki();
	
	public void driveOpel() {
		opel.drive();
	}
	
	public void driveSuzuki() {
		suzuki.drive();
	}
	
}
