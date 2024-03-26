package com.udemy.java8.optional.clss;

import java.util.Optional;

public class OptionalDemo3 {

	public static void main(String[] args) {

		String email = "Sneha@gail.com";
//		String email = null;

		// 1. orElse() method

		Optional<String> stringOptional = Optional.ofNullable(email);
		String defaultOptional = stringOptional.orElse("Poonam@gmail.com");// if email null it will print default
		System.out.println(defaultOptional);

		// 2. orElseGet()

		String method2 = stringOptional.orElseGet(() -> "default.com");

		System.out.println(method2);

		// 3 orElseThrow() method

		String method3 = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email Doesn't exist"));
		System.out.println(method3);

		// 4 ifPresent() method

		Optional<String> gender = Optional.of("MALE");
		gender.ifPresent((s) -> System.out.println("Value is Present"));

		// 5. filter()

		String result = "abc";
		if (result != null && result.contains("abc")) {
			System.out.println(result);
		}

		Optional<String> optionalStr = Optional.of(result);
		optionalStr.filter((res) -> res.contains("abc")).ifPresent((res) -> System.out.println(res));

		// 6. map() method

		String result2 = "DXC Technology.     ";
		if (result2 != null && result2.contains("abc")) {
			System.out.println(result2);
		}

		Optional<String> optionalStr2 = Optional.of(result);
		optionalStr2.filter((res) -> res.contains("abc"))
					.map(String::trim)
					.ifPresent((res) -> System.out.println(res));

	}
}
