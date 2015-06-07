package PokeJunit;

import org.junit.*;
import static org.junit.Assert.*;
public class PokeCombine {
	@Test
	public void testCombine(){
		PokeJUnit test = new PokeJUnit();
		String result = test.combine("Pika", "chu");
		assertEquals("Pikachu",result);
	}
}
