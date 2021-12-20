package com.socgen.emplmngt.repository.impl;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;


import com.socgen.emplmngt.dto.Employee;
import com.socgen.emplmngt.repository.EmployeeRepository;
import com.socgen.emplmngt.utils.DBUtils;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	
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
	public String addEmployee(Employee employee)  {
		
		String insertQuery = "insert into employee "
				+ "(empId, empFirstName, empLastName, address, empSalary) "
				+ ""+"values(?,?,?,?,?)";
		// TODO Auto-generated method stub
		
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = DBUtils.getConnection();
			preparedStatement = connection.prepareStatement(insertQuery);
			
			
			preparedStatement.setString(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpFirstName());
			preparedStatement.setString(3, employee.getEmpLastName());
			preparedStatement.setString(4, employee.getAddress());
			preparedStatement.setDouble(5, employee.getEmpSalary());
			int result =preparedStatement.executeUpdate();
			// number of affected rows
			
			if(result>0) {
				return "success";
			}
			else {
				return "fail";
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
		
		finally {
			try {
				DBUtils.closeConnection(connection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 
		
		
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
	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		
		Connection connection =  null;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		String query  = "select * from employee";
		
		try {
			connection = DBUtils.getConnection();
			
			preparedStatement = connection.prepareStatement(query);
			
			resultset = preparedStatement.executeQuery();
			
			while(resultset.next()) {
				// String / primitive values ====> Object
				// Object we need to add it into a collection.
			}
			
			
			
		} catch (ClassNotFoundException | IOException | SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	
}
