package com.jtudy.designpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

/*
 * Composite
 */
public class GeneralManager implements Employee {	
	
	private String name;
	private List<Employee> employees = new ArrayList<>();
	
	public GeneralManager(String name) {
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
		
		employees.forEach(employee -> employee.print());
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public Employee getChild(int index) {
		return employees.get(index);
	}

}