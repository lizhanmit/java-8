package com.zhandev.methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.zhandev.exercise.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		
		List<Person> people =  Arrays.asList(
				new Person("San", "Zhang", 20), 
				new Person("Si", "Li", 25), 
				new Person("Wu", "Wang", 30), 
				new Person("Liu", "Zhao", 35) 
			);
		
		/*
		 * create a method that prints all elements in the list 
		 */
		System.out.println("------ print all ------");
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		// or
		System.out.println("------ using method reference ------");
		performConditionally(people, p -> true, System.out::println);
		
	}
	
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}
}
