package com.udemy.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample {

	public static void main(String[] args) {

		/*
		 * Imperative - how style of programming
		 */

//		Q. Removing duplicate from a list of Integer

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 2, 3, 4, 5, 2, 3, 5, 6, 7, 8, 9, 8);
		List<Integer> uniqList = new ArrayList<>();
		for (Integer integer : integerList) {
			if (!uniqList.contains(integer)) {
				uniqList.add(integer);
			}
		}
		System.out.println("Uniq List by For Each loop Approach:" + uniqList);

		/*
		 * Declarative style of programming - what style of programming
		 */

		List<Integer> uniqList1 = integerList.stream().distinct().collect(Collectors.toList());

		System.out.println("Uniq List by Java 8 Approach:" + uniqList1);
	}
}
