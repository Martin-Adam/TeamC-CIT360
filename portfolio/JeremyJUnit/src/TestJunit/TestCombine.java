package TestJunit;


import org.junit.*;

import TestJunit.TestJUnit;
import static org.junit.Assert.*;
public class TestCombine {
	@Test
	public void testCombine(){
		TestJUnit test = new TestJUnit();
		// combines the two numbers
		int result = test.combine(8, 7);
		assertEquals(15, result);
	}
}
