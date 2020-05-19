package pr1.uebung05;

import static org.junit.Assert.*;
import pr.MakeItSimple.*;
import pr1.uebung04.Palindrome;
import pr1.uebung05.Fibonacci;

import org.junit.Test;

public class FibonacciTest {

	@Test(expected=PRException.class)
	public void numberLess1() throws Exception {
		Fibonacci.calculateFibonacci(0);
	}
	
	@Test
	public void fibonacci1() {
		int[] fibs = Fibonacci.calculateFibonacci(1);
		assertTrue(fibs[0]==0);
		assertTrue(fibs.length==1);
	}
	
	@Test
	public void fibonacci2() {
		int[] fibs = Fibonacci.calculateFibonacci(2);
		assertTrue(fibs[0]==0);
		assertTrue(fibs[1]==1);
		assertTrue(fibs.length==2);
	}
	
	@Test
	public void fibonacci3() {
		int[] fibs = Fibonacci.calculateFibonacci(3);
		assertTrue(fibs[0]==0);
		assertTrue(fibs[1]==1);
		assertTrue(fibs[2]==1);
		assertTrue(fibs.length==3);
	}
	
	@Test
	public void fibonacci4() {
		int[] fibs = Fibonacci.calculateFibonacci(4);
		assertTrue(fibs[0]==0);
		assertTrue(fibs[1]==1);
		assertTrue(fibs[2]==1);
		assertTrue(fibs[3]==2);
		assertTrue(fibs.length==4);
	}

	@Test
	public void fibonacci5() {
		int[] fibs = Fibonacci.calculateFibonacci(5);
		assertTrue(fibs[0]==0);
		assertTrue(fibs[1]==1);
		assertTrue(fibs[2]==1);
		assertTrue(fibs[3]==2);
		assertTrue(fibs[4]==3);
		assertTrue(fibs.length==5);
	}
	
	@Test
	public void fibonacci6() {
		int[] fibs = Fibonacci.calculateFibonacci(6);
		assertTrue(fibs[0]==0);
		assertTrue(fibs[1]==1);
		assertTrue(fibs[2]==1);
		assertTrue(fibs[3]==2);
		assertTrue(fibs[4]==3);
		assertTrue(fibs[5]==5);
		assertTrue(fibs.length==6);
	}
	
	@Test
	public void fibonacci7() {
		int[] fibs = Fibonacci.calculateFibonacci(7);
		assertTrue(fibs[0]==0);
		assertTrue(fibs[1]==1);
		assertTrue(fibs[2]==1);
		assertTrue(fibs[3]==2);
		assertTrue(fibs[4]==3);
		assertTrue(fibs[5]==5);
		assertTrue(fibs[6]==8);
		assertTrue(fibs.length==7);
	}
	
	@Test
	public void fibonacci8() {
		int[] fibs = Fibonacci.calculateFibonacci(8);
		assertTrue(fibs[0]==0);
		assertTrue(fibs[1]==1);
		assertTrue(fibs[2]==1);
		assertTrue(fibs[3]==2);
		assertTrue(fibs[4]==3);
		assertTrue(fibs[5]==5);
		assertTrue(fibs[6]==8);
		assertTrue(fibs[7]==13);
		assertTrue(fibs.length==8);
	}
}
