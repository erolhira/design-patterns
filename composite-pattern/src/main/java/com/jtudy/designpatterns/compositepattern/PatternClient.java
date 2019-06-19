package com.jtudy.designpatterns.compositepattern;

public class PatternClient {

	public static void main(String[] args) {

		GeneralManager generalManager = new GeneralManager("John Mohn");
		Manager manager = new Manager("Lahn Mahn");
		Cashier cashier1 = new Cashier("Jack Mack");
		Cashier cashier2 = new Cashier("Julia Mulia");
		Secretary secretary = new Secretary("Roza Moza");
		
		generalManager.add(manager);
		generalManager.add(secretary);
		manager.add(cashier1);
		manager.add(cashier2);
		
		generalManager.print();
	}

}
