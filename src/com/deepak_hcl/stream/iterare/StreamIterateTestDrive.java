package com.deepak_hcl.stream.iterare;

import java.util.stream.Stream;

public class StreamIterateTestDrive {

	public static void main(String[] args) {
		
		Stream.iterate(1, element -> element + 1)
			  .limit(5)
			  .forEach(System.out::println);
		
		System.out.println();
		int[] arr = {1,3,5,7,5,9,34,65,34,12,78};
		Stream.iterate(0, element -> element + 1)
			  .limit(arr.length)
			  .forEach(i -> System.out.println(arr[i]));
	}
}