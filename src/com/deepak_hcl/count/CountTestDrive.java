package com.deepak_hcl.count;

import java.util.ArrayList;
import java.util.List;

import com.deepak_hcl.lambda.Product;

public class CountTestDrive {

	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenovo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		long count = productsList.stream()
								 .filter(p -> p.getPrice() < 30000)
								 .count();
		System.out.println("Products less than 30000: " + count);
	}
}