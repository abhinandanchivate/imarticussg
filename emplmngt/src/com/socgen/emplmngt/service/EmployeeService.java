package com.socgen.emplmngt.service;

import java.util.List;

import com.socgen.emplmngt.dto.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);
	public String updateEmployee(String id, Employee employee);
	public String deleteEmployee(String id);
	public Employee getEmployeeById(String id);
	public List<Employee> getEmployees();
}
