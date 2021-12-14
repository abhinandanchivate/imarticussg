package com.socgen.emplmngt;

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
		
		
		String result  =employeeService.addEmployee(employee);
		
		System.out.println(result);

	}

}
