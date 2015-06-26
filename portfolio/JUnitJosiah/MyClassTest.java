package com.vogella.junit.first;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {

	@Test//(expected = IllegalArguemtExeption.class)
	public void testExceptionIsThrow() {
		MyClass tester = new MyClass();
		tester.multiple(1000, 5);
	}
	@Test
	public void testMutliple() {
		MyClass tester = new MyClass();
		assertEquals("10 x 5 must be 50", 50, tester.multiple(10, 5));
		fail("Not yet implemented");
	}

}
