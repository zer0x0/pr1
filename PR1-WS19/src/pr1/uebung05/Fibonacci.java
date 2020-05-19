package pr1.uebung05;

import static pr.MakeItSimple.*;

import pr.MakeItSimple.PRException;

public class Fibonacci {
	public static void main(String[] args) {
		println("Fibonacci");
		print("Wie viele Fibonacci Zahlen möchten Sie sehen?: ");
		int counter = 0;

		/**
		 * int param wird zur Methode calculateFibonacci übergeben, Ergebnis wird in
		 * paramArray geschrieben;
		 */

		int param = readInt();
		int[] paramArray = calculateFibonacci(param);

		// Ausgabe vom Index des paramArray;

		print("Die Fibonacci Folge lautet: ");
		while (counter < param) {
			print(paramArray[counter] + " ");

			counter++;
		}
	}

	/**
	 * Methode calculateFibonacci Berechnung der Fibonacci Folge <br>
	 * falls Übergabeparameter == 1 -> so steht an erster Stelle des paramArrays
	 * eine 0; <br>
	 * falls Übergabeparameter > 1 -> berechnung von FibonacciFolge startet;<br>
	 * falls Übergabeparameter != gültig -> throw new PRException("Eingabe ungültig
	 * / HaltStop! Nicht mit negativen Zahlen!");
	 * 
	 * @param n Anzahl der Fibonacci Zahlen
	 * @return Ausgabe eines Arrays der Fibonacci Zahlen
	 */

	public static int[] calculateFibonacci(int n) {
		int[] paramArray = new int[n];
		int whileCounter = 2;
		int firstNum = 0;
		int secondNum = 1;
		int numCounter = 0;
		
		if (n == 1) {
			paramArray[0] = 0;
			
		} else if (n > 1) {
			paramArray[0] = firstNum;
			paramArray[1] = secondNum;
			
			//Hier werden die Fibonaccizahlen berechnet und in unser Array gespeichert
			while (whileCounter < n) {
				numCounter = firstNum + secondNum;
				paramArray[whileCounter] = numCounter;
				firstNum = secondNum;
				secondNum = numCounter;

				whileCounter++;

			}
		} else {
			throw new PRException("Eingabe ungültig / Halt Stop! Nicht mit negativen Zahlen!");
		}
		return paramArray;
	}
}
