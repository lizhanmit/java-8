package com.zhandev.iteration;

import java.util.Arrays;
import java.util.List;

import com.zhandev.exercise.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people =  Arrays.asList(
				new Person("San", "Zhang", 20), 
				new Person("Si", "Li", 25), 
				new Person("Wu", "Wang", 30), 
				new Person("Liu", "Zhao", 35) 
			);
		
		System.out.println("------ using lambda expression ------"); 
		people.forEach(p -> System.out.println(p));
		
		// or
		System.out.println("------ using method reference ------");
		people.forEach(System.out::println);
	}
}
