package com.zhandev.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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
		
		
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		
		long countOfEmptyString = strings.stream().filter(s -> s.isEmpty()).count();
		System.out.println(countOfEmptyString);
		
		List<String> filteredStrings = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println(filteredStrings);
		
	    
		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
		IntSummaryStatistics stats = integers.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getSum());
		System.out.println(stats.getAverage());
		
		
		new Random().ints(10).sorted().forEach(System.out::println);
		
	}
}
