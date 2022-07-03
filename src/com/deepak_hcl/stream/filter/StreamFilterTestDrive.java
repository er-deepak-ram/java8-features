package com.deepak_hcl.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.deepak_hcl.lambda.Product;

public class StreamFilterTestDrive {

	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenovo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		List<Float> productPriceList = productsList.stream()
												   .filter(p -> p.getPrice() > 30000)
												   .map(p -> p.getPrice())
												   .collect(Collectors.toList());
		System.out.println(productPriceList);
	}
}