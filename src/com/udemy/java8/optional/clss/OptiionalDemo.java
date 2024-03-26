package com.udemy.java8.optional.clss;

import java.util.Optional;

public class OptiionalDemo {

	public static void main(String[] args) {

		// of, empty, ofNullable

//		String email = "amsarwade18@gmail.com";

		String email = null;

//		Optional<Object> emptyOptional = Optional.empty();
//		System.out.println(emptyOptional);
//
//		Optional<String> emailOptional = Optional.of(email);
//		System.out.println(emailOptional);
//
		Optional<String> stringOptional = Optional.ofNullable(email);
//		System.out.println(stringOptional);

//		isPresent Method

		if (stringOptional.isPresent()) {
			System.err.println(stringOptional.get());
		} else {
			System.out.println("No Value Present");
		}
		
//		orElse Method
		stringOptional.orElse("shamala@gmail.com");
		System.out.println(stringOptional);
		
	
	}
}
