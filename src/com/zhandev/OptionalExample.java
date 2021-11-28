package com.zhandev;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		OptionalExample optionalExample = new OptionalExample();
		
		Integer value1 = null; 
		Integer value2 = new Integer(10);
		
		// ofNullable() allows to pass null as param
		Optional<Integer> a = Optional.ofNullable(value1);
		
		// of() throws NullPointerException if passing null as param
		Optional<Integer> b = Optional.of(value2);
		
		System.out.println(optionalExample.sum(a, b));
	}
	
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		Integer value1 = null;
				
		if (a.isPresent()) {
			value1 = a.get();
		}
		else { 
			value1 = a.orElse(new Integer(0));
		}
		
		Integer value2 = null;
		
		if (b.isPresent()) {
			value2 = b.get();
		}
		else { 
			value2 = b.orElse(new Integer(0));
		}
		
		return value1 + value2;
	}
}
