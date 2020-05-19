package pr1.uebung04;

import static pr.MakeItSimple.*;

import pr.MakeItSimple.PRException;

public class Palindrome {

	public static void main(String[] args) {
		println("Palindrom");
		print("Bitte geben Sie eine Zahl ein: ");

		int num = readInt();

		if (isPalindrome(num) == true) {
			println("Palindrom");
		} else
			println("kein Palindrom");
	}

	/**
	 * Die Methode zerlegt die Zahl in Ihre Dezimalstellen und speichert jeden
	 * Dezimalstelle in ein Array. Die Array Werte werden anschliessend miteinander
	 * verglichen und bestimmt ob die Zahl ein Paöindrom ist.
	 * 
	 * @param zahla wird zerteilt, und in ein Array gespeichert.
	 * @return true/false falls die Zahl ein Palindrom ist.
	 */
	public static boolean isPalindrome(int zahla) {
		int arraymax = 0;
		int rest;
		int zahlArraylength = zahla;
		int zahlControl = zahla;
		int zahlReverse = 0;

		// Falls die Zahl negativ oder 0 ist wird die Methode beendet.
		if (zahla < 0)
			throw new PRException("Eingabe ungültig / Halt Stop! Nicht mit negativen Zahlen!");
		else if (zahla == 0) {
			return true;
		} else {

			// Hier wird die Größe von arraymax ermittelt.
			while (zahlArraylength != 0) {
				zahlArraylength = zahlArraylength / 10;
				arraymax++;
			}

			int arraymin = arraymax;
			int[] narray = new int[arraymax];

			// Hier wird die Zahl in ihre Dezimalstellen zerteilt und jede Stelle in das
			// Array abgespeichert.
			while (zahla != 0) {
				rest = zahla % 10;
				zahla = zahla / 10;
				arraymin--;
				narray[arraymin] = rest;
			}

			// Hier wird das Array rückwärts ausgegeben und in eine int Variabel gespeichert
			while (arraymin < arraymax) {
				zahlReverse = zahlReverse * 10 + narray[arraymax - 1];
				arraymax--;
			}
			
			// Hier wird verglichen ob die eingegbene Zahl vorwärts und rückwärts gelesen
			// gleich sind!
			if (zahlReverse == zahlControl) {
				return true;
			} else {
				return false;
			}
		}
	}
}