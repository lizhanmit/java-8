package com.zhandev.stream;

import java.util.Arrays;
import java.util.List;

import com.zhandev.exercise.Person;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> people =  Arrays.asList(
				new Person("San", "Zhang", 20), 
				new Person("Si", "Li", 25), 
				new Person("Wu", "Wang", 30), 
				new Person("Liu", "Zhao", 35) 
			);
		
		
		/*
		 * using stream to prints all people who have the last name beginning with "Z" 
		 */
		System.out.println("------ using stream to print people who have the last name beginning with 'Z' ------");
		people.stream()
				.filter(p -> p.getLastName().startsWith("Z"))
				.forEach(System.out::println);
		
		
		// parallel stream can be created if multiple cores are potentially to be used
		long count = people.parallelStream()
		.filter(p -> p.getLastName().startsWith("Z"))
		.count();
		
		System.out.println(count);

	}
}
