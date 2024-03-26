package com.udemy.java8.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		// Q Find the even number for Array using stream

		List<Integer> list = Arrays.asList(2, 34, 22, 13, 7, 9, 15, 16, 567, 85, 23, 76, 97);

		List<Integer> evenNo = list.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(evenNo);
	}
}
