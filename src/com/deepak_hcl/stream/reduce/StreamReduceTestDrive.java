package com.deepak_hcl.stream.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.deepak_hcl.lambda.Product;

public class StreamReduceTestDrive {

	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenovo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		Float totalPrice1 = productsList.stream()
									    .map(p -> p.getPrice())
									    .reduce(0.0f, (sum, price) -> sum + price);
		System.out.println(totalPrice1);
		
		Float totalPrice2 = productsList.stream()
									    .map(p -> p.getPrice())
									    .reduce(0.0f, Float::sum);
		System.out.println(totalPrice2);
		
		Double totalPrice3 = productsList.stream()
										 .collect(Collectors.summingDouble(p -> p.getPrice()));
		System.out.println(totalPrice3);
	}
}