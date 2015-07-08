package com.vogella.junit.first;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {

	//This is the good example to run
	@Test//(expected = IllegalArguemtExeption.class)
	public void testExceptionIsThrow() {
		MyClass tester = new MyClass();
		tester.multiple(10, 5);
	}
	
	//This is the bad example test.
	@Test
	public void testMutliply() {
		MyClass tester = new MyClass();
		assertEquals("10 x 5 must be 50", 50, tester.multiple(10, 5));
		fail("Not yet implemented");
	}

}
