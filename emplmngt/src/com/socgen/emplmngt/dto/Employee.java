package com.socgen.emplmngt.dto;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
// will provide setters , getters , hashcode, equals, 
//toString methods.
//@Setter
//@Getter
//@ToString

@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee>{

	
	
	private String empId;
	private String empFirstName;
	private String empLastName;
	private String address;
	private float empSalary;
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empId.compareTo(o.getEmpId());
	}
	
}
