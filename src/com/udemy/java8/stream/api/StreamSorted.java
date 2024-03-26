package com.udemy.java8.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSorted {

	public static void main(String[] args) {

		// Q Sort the list in Alphabetical order.

		List<Integer> list = Arrays.asList(9, 4, 5, 6, 3, 4, 6, 9, 8, 0, 8, 6, 4);
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);

		// Set Conversion it will removed duplicates

		Set<Integer> set = new HashSet<>(sorted);
		System.out.println(set);

		// Q Sort in descending order using Hard code login

		List<Integer> descendingOrder = list.stream().sorted((a, b) -> (a > b ? 1 : (a > b) ? -1 : 0))
				.collect(Collectors.toList());
		System.out.println(descendingOrder);

		// Q Sort in descending order using Comparator method of stream
		//Comparator  method contains compare method
		
		List<Integer> descendingOrder1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descendingOrder1);
	}

}
