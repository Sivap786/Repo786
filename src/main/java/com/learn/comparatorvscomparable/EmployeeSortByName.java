package com.learn.comparatorvscomparable;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<Employee>{

	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
