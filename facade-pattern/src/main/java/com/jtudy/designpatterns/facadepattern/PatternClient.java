package com.jtudy.designpatterns.facadepattern;

public class PatternClient {

	public static void main(String[] args) {
		
		CarDriver carDriver = new CarDriver();
		carDriver.driveOpel();
		carDriver.driveSuzuki();
	}
}
