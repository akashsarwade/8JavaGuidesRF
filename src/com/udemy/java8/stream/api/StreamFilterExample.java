package com.udemy.java8.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class StreamFilterExample {

	private static List<Product> getProducts() {
		List<Product> prodList = new ArrayList<Product>();

		prodList.add(new Product(1, "Dell", 25000.6f));
		prodList.add(new Product(2, "HP", 25000.6f));
		prodList.add(new Product(3, "APPLE", 25000.6f));
		prodList.add(new Product(4, "Dell", 25000.6f));

		return prodList;

	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();
		// we are filtering using for loop traditional way

		for (Product product : getProducts()) {
			if (product.getPrice() > 2500f) {
				list.add(product);
			}
		}
		for (Product product : list) {
			System.out.println(product);

		}

		// using New Way Java 8 stream API
		 getProducts().stream().filter((product) -> product.getPrice() > 2500f)
				.collect(Collectors.toList())
		.forEach(System.out::println);

	}
}
