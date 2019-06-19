package com.jtudy.designpatterns.compositepattern;

/*
 * Component
 */
public interface Employee {
	
	public String getName();
	
	/*
	 * execution method in the diagram
	 */
	public void print();
	
	/*
	 * methods for accessing and managing the child components:
	 */
	public void add(Employee employee);
	public void remove(Employee employee);
	public Employee getChild(int index);
}
