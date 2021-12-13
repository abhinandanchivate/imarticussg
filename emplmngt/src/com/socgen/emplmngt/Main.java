package com.socgen.emplmngt;

import com.socgen.emplmngt.service.EmployeeService;
import com.socgen.emplmngt.service.impl.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello from abhi");
		
		// need to confirm the single object 
		
		EmployeeService employeeService  = EmployeeServiceImpl.getInstance();
		System.out.println(employeeService);
		EmployeeService employeeService2  = EmployeeServiceImpl.getInstance();
		System.out.println(employeeService2);
		EmployeeService employeeService3  = EmployeeServiceImpl.getInstance();
		System.out.println(employeeService3);
		System.out.println(employeeService.equals(employeeService2));
		System.out.println(employeeService.equals(employeeService3));
		// have a recap from main till that service .
		

	}

}
