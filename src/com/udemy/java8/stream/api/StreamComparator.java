package com.udemy.java8.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparator {

	public static void main(String[] args) {
		// Comparator method contains compareTo() method

		List<Integer> list = Arrays.asList(20, 25, 30, 2, 10, 34, 40, 56, 043, 54, 2, 4, 1, 99);
		List<Integer> compare = list.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		System.out.println(compare);

		List<String> str = Arrays.asList("Akash", "Sham", "Ram", "John");
		List<String> asending = str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(asending);

	}
}
