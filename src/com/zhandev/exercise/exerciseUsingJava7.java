package com.zhandev.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exerciseUsingJava7 {

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
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		
		/*
		 * create a method that prints all elements in the list 
		 */
		System.out.println("------ print all ------");
		printAll(people);
		
		
		/*
		 * create a method that prints all people who have the last name beginning with "Z"
		 */
		System.out.println("------ print people who have the last name beginning with 'Z' ------");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("Z");
			}
		});
		
		
		/*
		 * create a method that prints all people who are older than 25 
		 */
		System.out.println("------ print people who have are older than 25 ------");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getAge() > 25;
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
	}

	interface Condition {
		boolean test(Person p);
	}
}
