package com.socgen.emplmngt;

import java.util.List;

import com.socgen.emplmngt.dto.Employee;
import com.socgen.emplmngt.service.EmployeeService;
import com.socgen.emplmngt.service.impl.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello from abhi");
		
		// need to confirm the single object 
		
		EmployeeService employeeService  = EmployeeServiceImpl.getInstance();
		System.out.println(employeeService);
		
		Employee employee = new Employee("ab001", "abhi", "chivate", "pune", 100.0f);
		
		employee.
		String result  =employeeService.addEmployee(employee);
 employee = new Employee("ab003", "abhi", "chivate", "pune", 100.0f);
		
		
		 result  =employeeService.addEmployee(employee);
 employee = new Employee("ab002", "abhi", "chivate", "pune", 100.0f);
		
		
		 result  =employeeService.addEmployee(employee);
		
		System.out.println(result);
		
		Employee employee2 = employeeService.getEmployeeById("ab001");
		
		System.out.println(employee2);

		
		
		
		result = employeeService.deleteEmployee("ab003");
List<Employee> list = employeeService.getEmployees();
		
		for (Employee employee3 : list) {
			System.out.println(employee3);
		}
	}

}
