package com.zhandev.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	
		System.out.println("=== all numbers: ");
		eval(list, i -> true);
		
		System.out.println("=== even numbers: ");
		eval(list, i -> i % 2 == 0);
		
		System.out.println("=== numbers greater than 3: ");
		eval(list, i -> i > 3);
	}
	
	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer i : list) {
			if (predicate.test(i)) {
				System.out.println(i);
			}
		}
	}
}
