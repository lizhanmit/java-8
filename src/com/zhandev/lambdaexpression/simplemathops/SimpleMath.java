package com.zhandev.lambdaexpression.simplemathops;

public class SimpleMath {

	public static void main(String[] args) {
		SimpleMath simpleMath = new SimpleMath();
		
		// with declaring type of input param 
		SimpleMathOperation addition = (int a, int b) -> a + b;
		
		// without declaring type of input param
		SimpleMathOperation subtraction = (a, b) -> a - b;
		
		// with return statement and curly braces
		SimpleMathOperation multiplication = (a, b) -> { return a * b; };
		
		// without return statement and curly braces
		SimpleMathOperation division = (a, b) -> a / b;
		
		System.out.println(simpleMath.operate(10, 5, addition));
		System.out.println(simpleMath.operate(10, 5, subtraction));
		System.out.println(simpleMath.operate(10, 5, multiplication));
		System.out.println(simpleMath.operate(10, 5, division));
	}
	
	private int operate(int a, int b, SimpleMathOperation simpleMathOperation) {
		return simpleMathOperation.operation(a, b);
	}
}
