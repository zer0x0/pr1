package pr1.uebung04;

import static org.junit.Assert.*;

import org.junit.Test;

import pr.MakeItSimple.PRException;

public class PalindromeTest {
	
	@Test(expected=PRException.class)
	public void negativeNumber() throws Exception {
		Palindrome.isPalindrome(-1);
	}

	@Test
	public void palindromes() {
		assertTrue(Palindrome.isPalindrome(0));
		assertTrue(Palindrome.isPalindrome(1234321));
		assertTrue(Palindrome.isPalindrome(1221));
		assertTrue(Palindrome.isPalindrome(123454321));
		assertTrue(Palindrome.isPalindrome(1234554321));
	}

	@Test
	public void NonPalindromes() {
		assertFalse(Palindrome.isPalindrome(122));
		assertFalse(Palindrome.isPalindrome(221));
		assertFalse(Palindrome.isPalindrome(12));
		assertFalse(Palindrome.isPalindrome(12331));
		assertFalse(Palindrome.isPalindrome(12231));
		assertFalse(Palindrome.isPalindrome(Integer.MAX_VALUE));
	}
	
}
