package com.udemy.java8.functionl.Intrface.with.lambda;

@FunctionalInterface
interface ThreadDemo {

	public void run();
}

public class MyThread {

	public static void main(String[] args) {

		ThreadDemo td = () -> System.out.println("This is My Thread Demo Run method");
		td.run();
	}
}
