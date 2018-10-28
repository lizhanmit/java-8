package com.zhandev.reference;

import java.util.function.Consumer;

public class ThisReferenceExample {

	public void doProcess(int i, Consumer<Integer> consumer) {
		consumer.accept(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("------ execute() method ------");
				System.out.println("Value of i is: " + i);
				// can call "this" as it is in a non-static method: execute()
				// "this" is in an instance method right now
				System.out.println(this);
			}
		);
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		System.out.println("------ using inner class ------"); 
		thisReferenceExample.doProcess(10, new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println("Value of i is: " + i);
				System.out.println(this);
			}
		});
		
		
		System.out.println("------ using lambda ------"); 
		thisReferenceExample.doProcess(10, i -> {
				System.out.println("Value of i is: " + i);
				// cannot call "this" in a static method (main function)
				// "this" is in lambda expression right now instead of the inner class like the above
				//System.out.println(this);
			}
		);
		
		
		thisReferenceExample.execute();
	}
}
