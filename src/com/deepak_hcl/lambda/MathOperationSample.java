package com.deepak_hcl.lambda;

public class MathOperationSample {

	public static void main(String[] args) {
		
		MathOperation addition = (a, b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;
		MathOperation multiplication1 = (a, b) -> { return a * b; };
		MathOperation multiplication2 = (a, b) -> a * b;
		MathOperation division = (a, b) -> a / b;
		
		System.out.println("10 + 5 = "+ addition.operation(10, 5));
		System.out.println("10 - 5 = "+ subtraction.operation(10, 5));
		System.out.println("10 * 5 = "+ multiplication1.operation(10, 5));
		System.out.println("10 * 5 = "+ multiplication2.operation(10, 5));
		System.out.println("10 / 5 = "+ division.operation(10, 5));
	}
}