package pr1.uebung06;

import static org.junit.Assert.*;

import org.junit.Test;

public class DividersArrayResultTest {

	@Test
	public void one() {
		int[] dividers = DividersArrayResult.calculateDividers(1);
		assertEquals(500, dividers.length);
		assertEquals(1, dividers[0]);
		for (int i = 1; i < 500; i++)
			assertEquals(0, dividers[i]);
	}

	@Test
	public void prime() {
		int[] dividers = DividersArrayResult.calculateDividers(17);
		assertEquals(500, dividers.length);
		assertEquals(1, dividers[0]);
		assertEquals(17, dividers[1]);
		for (int i = 2; i < 500; i++)
			assertEquals(0, dividers[i]);
	}

	@Test
	public void arbitrary() {
		int[] dividers = DividersArrayResult.calculateDividers(24);
		assertEquals(500, dividers.length);
		assertEquals(1, dividers[0]);
		assertEquals(2, dividers[1]);
		assertEquals(3, dividers[2]);
		assertEquals(4, dividers[3]);
		assertEquals(6, dividers[4]);
		assertEquals(8, dividers[5]);
		assertEquals(12, dividers[6]);
		assertEquals(24, dividers[7]);
		for (int i = 8; i < 500; i++)
			assertEquals(0, dividers[i]);
	}
	
}
