package com.deepak_hcl.stream.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTestDrive {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("corejava advancedjava oracle");
		li.add("rnit ut kit");
		li.add("deepak rahul ranjit");
		System.out.println("li: " + li);
		List<String> li1 = li.stream()
							 .flatMap(str -> Stream.of(str.split(" ")))
							 .collect(Collectors.toList());
		li1.forEach(System.out::println);
		
//		---------------------------------------------------------------
		// creating list of prime numbers
		List<Integer> primeNumbers = Arrays.asList(5, 7, 11, 13);
		
		//creating list of prime numbers
		List<Integer> oddNumbers = Arrays.asList(1, 3, 5);
		
		// creating list of even numbers
		List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);
		
		List<List<Integer>> listOfListOfInts = Arrays.asList(primeNumbers, oddNumbers, evenNumbers);
		System.out.println("The structure before flattening is: " + listOfListOfInts);
		
		// using flatmap for transformating and flattening
		List<Integer> listOfnts = listOfListOfInts.stream()
												  .flatMap(list -> list.stream())
												  .collect(Collectors.toList());
		System.out.println("The structure after flattening is: " + listOfnts);
	}
}