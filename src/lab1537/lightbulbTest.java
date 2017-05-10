package lab1537;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class lightbulbTest {
	
	lightbulb b;

	@Before
	public void setUp() throws Exception {
		b=new lightbulb(500);
	}

	@Test
	public void testGetLightbulb() {
		assertEquals(b.getLightbulb(),500);
	}

}
