package com.udemy.java8.pre.functionl.Intrface;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {

	// Consumer interface takes input ans does not return anything
	@Override
	public void accept(String input) {
		System.out.println(input);
	}

}

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> consumer = (input) -> System.out.println(input);
		consumer.accept("Hellow World");

	}

}
