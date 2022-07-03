package com.deepak_hcl.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSample {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "HP Laptyop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell mouse", 150f));

		Collections.sort(list, (p1, p2) -> (int) (p1.getPrice() - p2.getPrice()));
		list.forEach(System.out::println);
	}
}