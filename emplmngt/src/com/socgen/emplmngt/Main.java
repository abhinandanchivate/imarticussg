package com.socgen.emplmngt;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

import com.socgen.emplmngt.dto.Employee;
import com.socgen.emplmngt.service.EmployeeService;
import com.socgen.emplmngt.service.impl.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee("05", "abhi", "chivate", "pune", 100.0f);
		Employee employee2 = new Employee("02", "abhi", "chivate", "pune", 100.0f);

		Employee employee3 = new Employee("03", "advik", "chivate", "pune", 200.0f);
		
//		System.out.println(employee.hashCode());
//		System.out.println(employee2.hashCode());
//		System.out.println(employee.equals(employee)); // false
////		
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		employeeService.addEmployee(employee);
		employeeService.addEmployee(employee2);
		employeeService.addEmployee(employee3);
		
		Optional<Employee> optional = employeeService.getEmployeeById("07");
		
		if(optional.isPresent()) {
			System.out.println("Object present");
			System.out.println(optional.get());
		}
		else {
			System.out.println("not present");
		}
		
		Optional<List<Employee>> optional2 = employeeService.getEmployees();
		
		if(optional2.isPresent()) {
			
			List<Employee> employees = optional2.get();
			
			if(employees.isEmpty()) {
				System.out.println("rcvd empty list");
			}
			else {
				System.out.println(employees);
			}
		}
		else {
			System.out.println("there is no list");
		}
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
