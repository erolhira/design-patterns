package com.jtudy.designpatterns.compositepattern;

/*
 * Leaf
 */
public class Cashier implements Employee {

	private String name;	
	
	
	public Cashier(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void print() {
		System.out.println("--------------------");
		System.out.println(getClass().getSimpleName());
		System.out.println("Name: " + getName());
		System.out.println("--------------------");
	}

	@Override
	public void add(Employee employee) {
		//leaf not implements
	}

	@Override
	public void remove(Employee employee) {
		//leaf not implements
	}

	@Override
	public Employee getChild(int index) {
		return null;
	}
		
}
