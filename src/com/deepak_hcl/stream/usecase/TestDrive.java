package com.deepak_hcl.stream.usecase;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;

public class TestDrive {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		List<Response> responses = new ArrayList<>();
		employees.add(new Employee(1, "Avinash", LocalDate.of(1990, Month.MAY, 1)));
		employees.add(new Employee(2, "Amar", LocalDate.of(1990, Month.JUNE, 24)));
		employees.add(new Employee(3, "Anthony", LocalDate.of(1990, Month.DECEMBER, 15)));
		employees.add(new Employee(4, "Bhushan", LocalDate.of(1991, Month.JANUARY, 12)));
		employees.add(new Employee(5, "Bhavesh", LocalDate.of(1991, Month.JULY, 23)));
		employees.add(new Employee(6, "Bhaskar", LocalDate.of(1991, Month.NOVEMBER, 20)));
		employees.add(new Employee(7, "Chirag", LocalDate.of(1992, Month.APRIL, 1)));
		employees.add(new Employee(8, "Chetan", LocalDate.of(1992, Month.JULY, 15)));
		employees.add(new Employee(9, "Chaitanya", LocalDate.of(1992, Month.NOVEMBER, 19)));
		
		List<Integer> years = employees.stream()
									   .map(e -> e.getDateOfBirth().getYear())
									   .distinct()
									   .collect(Collectors.toList());
		
		years.forEach(year -> {
			List<Employee> empResponse = new ArrayList<>();
			Response response = new Response();
			empResponse.addAll(employees.stream()
										.filter(emp -> emp.getDateOfBirth().getYear() == year)
										.collect(Collectors.toList()));
			
			response.setHigh(empResponse.stream().map(e -> e.getDateOfBirth().getDayOfMonth()).max((d1, d2) -> d1 > d2 ? 1 : -1).get());
			response.setLow(empResponse.stream().map(e -> e.getDateOfBirth().getDayOfMonth()).min((d1, d2) -> d1 > d2 ? 1 : -1).get());
			response.setAverage(empResponse.stream().mapToDouble(e -> e.getDateOfBirth().getDayOfMonth()).average().getAsDouble());
			response.setYear(year);
			responses.add(response);
		});
		
		responses.forEach(System.out::println);
	}
}

@Data
class Response {
	int year, low, high;
	double average;
}