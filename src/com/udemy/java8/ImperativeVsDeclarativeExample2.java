package com.udemy.java8;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {

		/*
		 * Imperative - how style of programming
		 */

		int sum = 0;
		for (int i = 0; i <=100; i++) {
			sum += i;
		}
		System.out.println("Sum using Imperative approach:" + sum);

		/*
		 * Declarative style of programming - what style of programming
		 * InStream method provide by java8 stream features
		 * rangeClosed means we only need to pass value from 0-100 or what u want.
		 */
		
		int sum1 = IntStream.rangeClosed(0,100).sum();
		
		System.out.println("Sum using Declarative approach:" +sum1);
	}
}
