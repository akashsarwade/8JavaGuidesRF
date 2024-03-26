package com.udemy.java8.lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		/*
		 * prior java 8
		 */

		Runnable runnable = new Runnable() {

			@Override
			public void run() {

				System.out.println("Inside Runnable");
			}
		};
		new Thread(runnable).start();

		/*
		 * Java 8 Lambda Syntax ()->{}
		 */

		Runnable runnableLambda = () -> {
			System.out.println("I am inside Runnable with Lambda");
		};

		Runnable runnableLambda1 = () -> System.out.println("I am inside Runnable with Lambda single line");

		new Thread(runnableLambda).start();

		new Thread(runnableLambda1).start();
		
		Object o=new Object();
	}
}
