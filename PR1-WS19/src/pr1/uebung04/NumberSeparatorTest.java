package pr1.uebung04;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberSeparatorTest {

	@Test
	public void zahlNull() {
		assertEquals("+,0", NumberSeparator.splitNumber(0));
	}

	@Test
	public void negativeZiffer() {
		assertEquals("-,5", NumberSeparator.splitNumber(-5));
	}

	@Test
	public void negativeZahl() {
		assertEquals("-,1,2,3", NumberSeparator.splitNumber(-123));
	}

	@Test
	public void positiveZiffer() {
		assertEquals("+,5", NumberSeparator.splitNumber(5));
	}

	@Test
	public void positiveZahl() {
		assertEquals("+,1,2,3", NumberSeparator.splitNumber(123));
	}

	@Test
	public void beispiel() {
		assertEquals("+,2,4,6", NumberSeparator.splitNumber(246));
	}
	@Test
	public void negativeZahlEndetMitNull() {
		assertEquals("-,1,2,0", NumberSeparator.splitNumber(-120));
	}

	@Test
	public void positiveZahlEndetMitNull() {
		assertEquals("+,1,2,0", NumberSeparator.splitNumber(120));
	}

	@Test
	public void minInt() {
		assertEquals("-,2,1,4,7,4,8,3,6,4,8", NumberSeparator.splitNumber(Integer.MIN_VALUE));
	}

	@Test
	public void maxInt() {
		assertEquals("+,2,1,4,7,4,8,3,6,4,7", NumberSeparator.splitNumber(Integer.MAX_VALUE));
	}

}
