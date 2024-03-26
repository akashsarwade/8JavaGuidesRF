package com.udemy.java8.pre.functionl.Intrface;

class RunnableImpl implements Runnable {

	@Override
	public void run() {
		System.out.println("Run Method of Runnable Interface");
	}

}

public class RunnableDemo {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("run method called using Lambda");
		};

		runnable.run();
	}
}
