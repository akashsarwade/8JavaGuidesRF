package com.udemy.java8.pre.functionl.Intrface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDateTime> {
//Supplier Interface supply some data to the client
//	Supplier method has get() method only

	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();
	}

}

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();

		System.out.println(supplier.get());
	}
}
