package pr1.uebung04;

import static org.junit.Assert.*;
import pr.MakeItSimple.PRException;

import org.junit.Test;

public class PerfectNumberTest {

	@Test(expected=PRException.class)
	public void minValue() throws Exception {
		PerfectNumber.isPerfectNumber(Integer.MIN_VALUE);
	}

	@Test(expected=PRException.class)
	public void negativeNumber() throws Exception {
		PerfectNumber.isPerfectNumber(-1);
	}

	@Test(expected=PRException.class)
	public void zero() throws Exception {
		PerfectNumber.isPerfectNumber(0);
	}

	@Test
	public void oneToTen() throws Exception {
		assertFalse(PerfectNumber.isPerfectNumber(1));
		assertFalse(PerfectNumber.isPerfectNumber(2));
		assertFalse(PerfectNumber.isPerfectNumber(3));
		assertFalse(PerfectNumber.isPerfectNumber(4));
		assertFalse(PerfectNumber.isPerfectNumber(5));
		assertFalse(PerfectNumber.isPerfectNumber(7));
		assertFalse(PerfectNumber.isPerfectNumber(8));
		assertFalse(PerfectNumber.isPerfectNumber(9));
		assertFalse(PerfectNumber.isPerfectNumber(10));
	}

	@Test
	public void arbitraryNumbers() throws Exception {
		assertFalse(PerfectNumber.isPerfectNumber(111));
		assertFalse(PerfectNumber.isPerfectNumber(2222));
		assertFalse(PerfectNumber.isPerfectNumber(333333));
		assertFalse(PerfectNumber.isPerfectNumber(444444444));
		assertFalse(PerfectNumber.isPerfectNumber(57));
		assertFalse(PerfectNumber.isPerfectNumber(13));
		assertFalse(PerfectNumber.isPerfectNumber(2114618273));
		assertFalse(PerfectNumber.isPerfectNumber(21093482));
		assertFalse(PerfectNumber.isPerfectNumber(918392));
		
		for (int i = 8129; i < 14000; i++)
			assertFalse("" + i, PerfectNumber.isPerfectNumber(i));
	}
	
	@Test
	public void allPerfectNumbersWithinInteger() throws Exception {
		assertTrue(PerfectNumber.isPerfectNumber(6));
		assertTrue(PerfectNumber.isPerfectNumber(28));
		assertTrue(PerfectNumber.isPerfectNumber(496));
		assertTrue(PerfectNumber.isPerfectNumber(8128));
		assertTrue(PerfectNumber.isPerfectNumber(33550336));
	}

	@Test
	public void maxValue() throws Exception {
		assertFalse(PerfectNumber.isPerfectNumber(Integer.MAX_VALUE));
	}

}
