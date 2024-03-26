package com.udemy.java8.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		// Q Multiply by 2 for each element of element from list

		List<Integer> list = Arrays.asList(2, 4, 6, 8, 5, 6, 3);
		List<Integer> multiplyTwo = list.stream().map((i) -> i * 2).collect(Collectors.toList());
		System.out.println(multiplyTwo);

		// Q Select the only passed Student

		List<Integer> marks = Arrays.asList(35, 40, 60, 80, 22, 50);
		List<Integer> passed = marks.stream().filter(i -> i > 45).collect(Collectors.toList());
		System.out.println(passed);

		passed = marks.stream().filter(i -> i < 35).collect(Collectors.toList());
		System.out.println(passed);

	}

}
