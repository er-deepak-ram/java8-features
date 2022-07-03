package com.deepak_hcl.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

	private int id;
	private String name;
	private Float price;
	
}