package com.socgen.emplmngt.service.impl;

import java.util.List;

import com.socgen.emplmngt.dto.Employee;
import com.socgen.emplmngt.repository.EmployeeRepository;
import com.socgen.emplmngt.repository.impl.EmployeeRepositoryImpl;
import com.socgen.emplmngt.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	// service must have employeerepository object(singleton )
	
	private EmployeeRepository employeeRepository = 
			EmployeeRepositoryImpl.getInstance();
	
	
	private static EmployeeServiceImpl employeeServiceImpl;
	private EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public static EmployeeService getInstance() {
		// to provide the singleton object
		if(employeeServiceImpl== null) {
			employeeServiceImpl = new EmployeeServiceImpl();
			return employeeServiceImpl;
		}
		else {
			return employeeServiceImpl;
		}
		
	}
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.addEmployee(employee);
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
