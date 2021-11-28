package com.zhandev.methodreferences;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(() -> printMessage());
		thread1.start();
		
		// or
		System.out.println("------ using method reference ------");
		// if there is no input argument of the lambda expression and the method, 
		// you can use method reference expression 
		Thread thread2 = new Thread(MethodReferenceExample1::printMessage);
		thread2.start();
	}
	
	public static void printMessage() {
		System.out.println("hi");
	}
}
