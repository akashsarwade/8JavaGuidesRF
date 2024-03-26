package com.udemy.java8.stream.api;

import java.util.Arrays;
import java.util.List;

public class StreamForEach {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(8, 64, 3, 23, 12, 45);
		list.stream().forEach(System.out::println);
	}
}
