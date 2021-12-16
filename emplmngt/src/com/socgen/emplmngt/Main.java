package com.socgen.emplmngt;

import java.util.List;
import java.util.TreeSet;

import com.socgen.emplmngt.dto.Employee;
import com.socgen.emplmngt.service.EmployeeService;
import com.socgen.emplmngt.service.impl.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee("05", "abhi", "chivate", "pune", 100.0f);
		Employee employee2 = new Employee("02", "abhi", "chivate", "pune", 100.0f);
//		
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee.equals(employee)); // false
//		
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		employeeService.addEmployee(employee);
		employeeService.addEmployee(employee2);
//		
	System.out.println(employeeService.getEmployees());
		
//		TreeSet<Integer> treeSet = new TreeSet<>();
//		treeSet.add(10);
//		treeSet.add(200);
//		treeSet.add(10);
//		treeSet.add(400);
//		treeSet.add(4);
//		
//		
//		System.out.println(treeSet);
	}

}
