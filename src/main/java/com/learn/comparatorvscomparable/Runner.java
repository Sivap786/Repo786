package com.learn.comparatorvscomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Employee srini = new Employee();
		srini.setName("SRINI");
		srini.setSalary(1000);
		
		Employee prashant = new Employee();
		prashant.setName("PRASHANT");
		prashant.setSalary(1100);
		
		Employee raamu = new Employee();
		raamu.setName("RAAMU");
		raamu.setSalary(1200);
		
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(srini);
		empList.add(prashant);
		empList.add(raamu);
		
		List<Employee> dupList = new ArrayList<Employee>();
		dupList.addAll(empList);
		
		Iterator<Employee> iteDup = empList.iterator();
		while(iteDup.hasNext()) {
			Employee e = iteDup.next();
			System.out.println(e.getName());
		}
		
		Collections.sort(empList);
		
		Iterator<Employee> ite = empList.iterator();
		while(ite.hasNext()) {
			Employee e = ite.next();
			System.out.println(e.getName());
		}
		
		Collections.sort(empList, new EmployeeSortByName());
		Iterator<Employee> iteComparator = empList.iterator();
		while(iteComparator.hasNext()) {
			Employee e = iteComparator.next();
			System.out.println(e.getName());
		}
	}

}
