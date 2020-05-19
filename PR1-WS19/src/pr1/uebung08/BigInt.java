package pr1.uebung08;

import static pr.MakeItSimple.*;

public class BigInt {

	int num;
	int[] numArray;
	
	private void trimZeros() {
		int counter = 0;
		for (int i = 0; i < numArray.length && numArray[i] == 0; i++) {
			if (numArray[i] == 0) {
				counter++;
			}
		}
		int[] numArray2 = new int[numArray.length - counter];
		for (int i = numArray.length; i > 0 + counter; i--) {
			numArray2[i - 1 - counter] = numArray[i - 1];
		}
		numArray = numArray2;
	}
	
	public BigInt(String numString) {

		char[] stringToChar = new char[numString.length()];

		stringToChar = numString.toCharArray();

		numArray = new int[numString.length()];

		for (int i = 0; i < numString.length(); i++) {
			numArray[i] = Character.getNumericValue(stringToChar[i]);
			if (numArray[i] > 9) {
				throw new PRException("Eingabe ung�ltig!");
			}
		}
		trimZeros();
	}

	public String toString() {
		String numAsString = "";

		for (int i = 0; i < numArray.length; i++) {
			numAsString = numAsString + numArray[i];
		}
		return numAsString;

	}

	public int[] getDigits() {
		return numArray;
	}

	public int length() {
		return numArray.length;
	}

	boolean equals(BigInt number) {
		if (numArray.length != number.length()) {
			return false;
		} else {
			for (int i = 0; i < numArray.length; i++) {
				if (numArray[i] != number.getDigits()[i]) {
					return false;
				}
			}
			return true;
		}
	}
	
	boolean greaterThan(BigInt number) {
		if (numArray.length < number.length()) {
			return false;
		} else if (numArray.length > number.length()) {
			return true;
		} else {
			for (int i = 0; i < numArray.length; i++) {
				if (numArray[i] < number.getDigits()[i]) {
					return false;
				}
				if (numArray[i] > number.getDigits()[i]) {
					return true;
				}
			}
			return false;
		}

	}

	void add(BigInt numbr) {
		int length;
		if (numArray.length > numbr.length()) {
			length = numArray.length;
		} else
			length = numbr.length();
		int[] sum = new int[length + 1];

		int carryover = 0;
		for (int i = length; i >= 0; i--) {
			int j = i - (sum.length - numArray.length);
			int k = i - (sum.length - numbr.length());
			int fristNumberDigit;
			int secondNumberDigit;
			if (j >= 0) {
				fristNumberDigit = numArray[j];
			} else
				fristNumberDigit = 0;

			if (k >= 0) {
				secondNumberDigit = numbr.getDigits()[k];
			} else
				secondNumberDigit = 0;

			int digitSum = fristNumberDigit + secondNumberDigit + carryover;
			carryover = digitSum / 10;
			sum[i] = digitSum % 10;
		}
		numArray = sum;
		trimZeros();

	}



	



	
	
	public static void main(String[] args) {
		
//		test if .toString works
		println(new BigInt("3").toString() + " Should be 3");
		println(new BigInt("000315654313685613615").toString() + " Should be 315654313685613615");

//		test if .getDigits works
		println(new BigInt("0123456789").getDigits()[0] + " Should be " + 1);
		println(new BigInt("0123456789").getDigits()[5] + " Should be " + 6);

//		test if .length works
		println(new BigInt("123456789").length() + " Should be " + 9);
		println(new BigInt("000006789").length() + " Should be " + 4);

//		test if .equals works
		
		println(new BigInt("68").equals(new BigInt("68")) + " Should be " + true);
		println(new BigInt("000123").equals(new BigInt("123000")) + " Should be " + false);
		
//		test if .greaterThan works
		println(new BigInt("123456789").greaterThan(new BigInt("23456789")) + " Should be " + true);
		println(new BigInt("666").greaterThan(new BigInt("6666")) + " Should be " + false);

//		test if .add works		
		BigInt zahl1 = new BigInt("22");
		BigInt zahl2 = new BigInt("100");
		zahl1.add(zahl2);
		println(zahl1.toString());
		
//		show off that we can add huge numbers
		BigInt zahl3 = new BigInt("9999999999999999999999999999999");
		BigInt zahl4 = new BigInt("9999999999999999999999999999999");
		println(zahl3.toString());
		println("+");
		println(zahl4.toString());
		zahl3.add(zahl4);
		println('=');
		println(zahl3.toString());

	}

}
