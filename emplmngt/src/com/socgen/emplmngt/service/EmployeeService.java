package com.socgen.emplmngt.service;

import java.util.List;
import java.util.Optional;

import com.socgen.emplmngt.dto.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);
	public String updateEmployee(String id, Employee employee);
	public String deleteEmployee(String id);
	public Optional<Employee> getEmployeeById(String id);
	public Optional<List<Employee>> getEmployees();
}
