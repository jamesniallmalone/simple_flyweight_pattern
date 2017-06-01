package flyweight.engine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStandardEngine {
	
	private StandardEngine se;
	private int size = 20;

	@Before
	public void initialise(){
		se = new StandardEngine(size);
	}

	@Test
	public void testStandardEngine() {
		assertNotNull("Shouldn't be null", se);
	}

	@Test
	public void testGetSize() {
		assertEquals("Should be size from creation", size, se.getSize());
	}

	@Test
	public void testIsTurbo() {
		assertFalse("Should be false by default", se.isTurbo());
	}

	@Test
	public void testDiagnose() {
		fail("Not yet implemented");
	}

}
