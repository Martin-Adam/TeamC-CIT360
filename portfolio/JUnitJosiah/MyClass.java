package com.vogella.junit.first;

public class MyClass {
	public int mutliply(int x, int y){
		//the following is just an example
		if (x > 999) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x / y;
	}

	
}