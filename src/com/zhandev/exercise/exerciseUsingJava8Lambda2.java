package com.zhandev.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Instead of using printConditionally() in exerciseUsingJava8Lambda.java, you can generalize the behavior of the function by add a new parameter to specify the behavior. 
 * Here we replace printConditionally() with performConditionally().
 */
public class exerciseUsingJava8Lambda2 {

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
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		
		/*
		 * create a method that prints all people who have the last name beginning with "Z"
		 */
		System.out.println("------ print people who have the last name beginning with 'Z' ------");
		performConditionally(people, p -> p.getLastName().startsWith("Z"), p -> System.out.println(p));
		
		
		/*
		 * create a method that prints all people who are older than 25 
		 */
		System.out.println("------ print people who have are older than 25 ------");
		performConditionally(people, p -> p.getAge() > 25, p -> System.out.println(p));
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}
}
