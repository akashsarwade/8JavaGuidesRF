package com.udemy.java8.stream.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObject {

	public static void main(String[] args) {

		// Create Stream

		Stream<String> stream = Stream.of("a", "c", "b");
		stream.forEach(System.out::println);

		// Create stream from sources using Collection

		Collection<String> collection = Arrays.asList("Pune", "Mumbai", "Banglore", "Chennai");
		Stream<String> city = collection.stream();
		city.forEach(System.out::println);

		// Create stream from sources using Collection

		List<String> list = Arrays.asList("BANANA", "GREPS", "ORANGE", "CHIKU");
		Stream<String> fruits = list.stream();
		fruits.forEach(System.out::println);

		// create Stream from set

		Set<String> set = new HashSet<>(list);
		Stream<String> frut = set.stream();
		frut.forEach(System.out::println);

		// Create stream form using Array
		String[] strArr = { "X", "Y", "Z" };
		Stream<String> streamArry = Arrays.stream(strArr);
		streamArry.forEach(System.out::println);

	}
}
