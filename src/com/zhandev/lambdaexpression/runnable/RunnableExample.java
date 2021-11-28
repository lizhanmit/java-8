package com.zhandev.lambdaexpression.runnable;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("printed inside Runnable");
			}
		});
		
		myThread.run();
	
		// another way: using lambda expression
		// Runnable interface only has one abstract method 
		// so you can apply lambda expression to take place the inner class here 
		Thread myLambdaThread = new Thread(() -> System.out.println("printed lambda Runnable"));
		myLambdaThread.run();
	}
}
