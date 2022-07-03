package com.deepak_hcl.stream.listtomap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.deepak_hcl.lambda.Product;

public class ListToMapTestDrive {

	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenovo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		Map<Integer, String> productMap = productsList.stream()
													  .collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
		
		productMap.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}