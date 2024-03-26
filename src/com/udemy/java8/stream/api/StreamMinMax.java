package com.udemy.java8.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(9, 4, 5, 6, 3, 4, 6, 9, 8, 0, 8, 6, 4);
		Optional<Integer> minn = list.stream().min(Integer::compareTo);
		System.out.println(minn);

		Optional<Integer> max = list.stream().max(Integer::compareTo);
		System.out.println(max);

		Integer maxNum = list.stream().min((a, b) -> Integer.compare(b, a)).get();
		System.err.println(maxNum);
	}
}
