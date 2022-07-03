package com.deepak_hcl.mathod_reference;

public class EmployeeTestDrive {

	public static void main(String[] args) {
		
		EmployeeFactory empFactory = Employee::new;
		Employee emp = empFactory.getEmployee("Bhavesh Notwani", 30);
		System.out.println(emp);
		
//		Compile Time Error!!!
		
//		*** The target type of this expression must be a functional interface
//		Employee empObj = Employee::new;
		
//		*** The type AnyOtherClass does not define AnyOtherClass(String, Integer) that is applicable here
//		EmployeeFactory otherFactory = AnyOtherClass::new;

	}
}
