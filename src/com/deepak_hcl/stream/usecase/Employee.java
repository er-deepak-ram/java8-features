package com.deepak_hcl.stream.usecase;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	private int empId;
	private String name;
	private LocalDate dateOfBirth;
	
	public boolean equals(Object o) {
		if(o == null) 
			return false;
		Employee e = (Employee) o;
		if(this.dateOfBirth.getYear() == e.dateOfBirth.getYear())
			return true;
		return false;
	}
}