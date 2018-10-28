package com.zhandev.closures;

import java.util.function.Consumer;

public class ClosuresExample {

	public static void main(String[] args) {
		
		int a = 1;
		
		// in Java 8, b is effectively final 
		// which means the compiler assumes that you will not modify the value of b in the enclosing scope inside the lambda expression 
		// otherwise there will be an error
		int b = 2;
		
		// in Java 7, you must declare b as final
		//final int b = 2;
		
		doProcess(a, i -> System.out.println(i + b));
	}

	private static void doProcess(int i, Consumer<Integer> consumer) {
		consumer.accept(i);
	}
}
