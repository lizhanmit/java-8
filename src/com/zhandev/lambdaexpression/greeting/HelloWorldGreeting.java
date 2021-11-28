package com.zhandev.lambdaexpression.greeting;

public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello world");
	}

}
