package com.socgen.emplmngt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// will provide setters , getters , hashcode, equals, 
//toString methods.

@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private String empId;
	private String empFirstName;
	private String empLastName;
	private String address;
	private float empSalary;
	
}
