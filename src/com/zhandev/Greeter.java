package com.zhandev;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		/*
		 * various ways to print "hello world"
		 */
		// 1st way
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		// passing object
		greeter.greet(helloWorldGreeting);
		
		
		// 2nd way 
		// inner class
		Greeting innerClassGreeting = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello world");				
			}
		};
		innerClassGreeting.perform();
		// or
		greeter.greet(innerClassGreeting);
		
		
		// 3rd way
		// apply lambda expression 
		// if you use an interface to declare the lambda function, this interface can only have one abstract method
		Greeting lambdaGreeting = () -> System.out.println("Hello world");
		lambdaGreeting.perform();
		// or
		greeter.greet(lambdaGreeting);
		// or 
		greeter.greet(() -> System.out.println("Hello world"));
				
	}
}
