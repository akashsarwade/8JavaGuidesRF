package com.udemy.java8.stream.api;

import java.util.Arrays;

public class StreamToArray {

	public static void main(String[] args) {

		// Q Convert Array to Stream 

		Integer[] arr = { 4, 3, 2, 55, 44, 32, 12, 67 };
		Arrays.stream(arr).filter((i) -> i > 10).forEach(System.out::println);
	
	
		// Q Convert Stream to Array
		
		
	
	}
	
}
