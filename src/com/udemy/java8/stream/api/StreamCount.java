package com.udemy.java8.stream.api;

import java.util.Arrays;
import java.util.List;

public class StreamCount {

	public static void main(String[] args) {
		//	Q List the Failed students from list
		
		List<Integer>makrs=Arrays.asList(22,44,5,11,2,88,65,77,98,67,54);
		long noFailedStud=makrs.stream().filter(i-> i<35).count();
		System.out.println(noFailedStud);
	}
}
