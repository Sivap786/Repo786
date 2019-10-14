package com.learn.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList<Employee>();
		//List listOne = new ArrayList<Integer>();
		for(int i =0; i<10;i++) {

			Employee e = new Employee();
			e.setEmpName("Xyz");
			e.setSalary(100);
			list.add(e);
			}
		
		
		Iterator<Employee> ite = list.iterator();
		while (ite.hasNext()) {
			Employee e = ite.next();
			e.getEmpName();
			
		}
	}

}
