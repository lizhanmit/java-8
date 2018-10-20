package com.zhandev.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class exerciseUsingJava8Lambda {

	public static void main(String[] args) {

		List<Person> people =  Arrays.asList(
					new Person("San", "Zhang", 20), 
					new Person("Si", "Li", 25), 
					new Person("Wu", "Wang", 30), 
					new Person("Liu", "Zhao", 35) 
				);
		
		/*
		 * sort the list by last name
		 */
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		
		/*
		 * create a method that prints all elements in the list 
		 */
		System.out.println("------ print all ------");
		printConditionally(people, p -> true);
		
		
		/*
		 * create a method that prints all people who have the last name beginning with "Z"
		 */
		System.out.println("------ print people who have the last name beginning with 'Z' ------");
		printConditionally(people, p -> p.getLastName().startsWith("Z"));
		
		
		/*
		 * create a method that prints all people who are older than 25 
		 */
		System.out.println("------ print people who have are older than 25 ------");
		printConditionally(people, p -> p.getAge() > 25);
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if (predicate.test(person)) {
				System.out.println(person);
			}
		}
	}

//	interface Condition {
//		boolean test(Person p);
//	}
}
