package com.socgen.emplmngt;

import java.util.Iterator;
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
//		employeeService.addEmployee(employee);
//		employeeService.addEmployee(employee2);
//		employeeService.addEmployee(employee3);
		
//		Optional<List<Employee>> optional = employeeService.getEmployees();
//		
//		if(optional.isPresent()) {
//			for (Employee emp : optional.get()) {
//				
//				System.out.println(emp);
//				
//			}
//			
//			optional.get().forEach(emp->System.out.println(emp));
//		}
		
		
		Optional<Employee> optional = employeeService.getEmployeeById("09");
		
		if(optional.isPresent()) {
			
			System.out.println(optional.get());
		}
		else
			System.out.println("not present / available");
		
		
	}

}
