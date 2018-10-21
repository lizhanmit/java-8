package com.zhandev;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		int[] someNumbers = {1,2,3,4,5};
		int key = 0; 
		
		// use a try-catch out of the lambda expression for handling the exception 
		// but this does not look concise
		process(someNumbers, key, (v, k) -> {
				try {
					System.out.println(v / k);
				} catch (ArithmeticException e) {
					System.out.println("An arithmetic exception occurs.");
				}
			});
		
		
		// a better way 
		// isolate the try-catch out into a separate lambda expression: wrapperLambda
		System.out.println("------ use wrapperLambda ------");
		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : someNumbers) {
			biConsumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (v, k) -> {
			try {
				biConsumer.accept(v, k);;
			} catch (ArithmeticException e) {
				System.out.println("An arithmetic exception occurs in wrapperLambda.");
			}
		};
	}
	
}
