package com.udemy.java8.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		List<String>city=new ArrayList<>();
		city.add("PUNE");
		city.add("Banglore");
		city.add("Chennai");
		city.add("Goa");
		city.add("Ujjian");
		city.add("Delhi");
		
		System.out.println("Sorted List");
		List<String>sortedList=city.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		sortedList.forEach(System.out::println);
		System.out.println("------------------------------");
		
		List<String>sortedList1=city.stream().sorted((ol, o2)->ol.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		sortedList1.forEach(System.out::println);
		
		
		
		
	}
}
