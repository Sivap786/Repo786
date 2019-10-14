package com.learn.comparatorvscomparable;

import java.io.Serializable;

public class Employee implements Comparable<Employee>{

	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int compareTo(Employee emp) {
		return this.getName().compareTo(emp.getName());
	}
}
