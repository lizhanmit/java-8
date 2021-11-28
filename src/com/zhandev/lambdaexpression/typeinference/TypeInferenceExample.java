package com.zhandev.lambdaexpression.typeinference;

public class TypeInferenceExample {

	public static void main(String[] args) {
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("hello Lambda"));
	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}

}
