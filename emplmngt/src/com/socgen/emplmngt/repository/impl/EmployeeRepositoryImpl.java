package com.socgen.emplmngt.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.socgen.emplmngt.dto.Employee;
import com.socgen.emplmngt.repository.EmployeeRepository;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private ArrayList<Employee> arrayList = new ArrayList<>();
	// 10

	// singleton DP
	private static EmployeeRepository employeeRepository;

	private EmployeeRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	public static EmployeeRepository getInstance() {

		if (employeeRepository == null) {
			employeeRepository = new EmployeeRepositoryImpl();

		}
		return employeeRepository;
	}

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub

		boolean result = arrayList.add(employee);

		if (result)
			return "successs";
		else
			return "fail";
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(String id) {
		Employee employee = this.getEmployeeById(id);

		if (employee != null) {
			
			arrayList.remove(employee);
			return "success";

		} else

			return "not found";
	}

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub

		// to find the specific id ===> we need to retrieve the employee object ===>
		// available in arraylist
		// do we need to traverse the arraylist? ==> yes

		for (Employee employee : arrayList) {

			if (id.equals(employee.getEmpId())) {
				return employee;
			}

		}

		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return arrayList;
	}

}
