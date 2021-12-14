package com.socgen.emplmngt.dto;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
