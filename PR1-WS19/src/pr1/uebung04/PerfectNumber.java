package pr1.uebung04;

import static pr.MakeItSimple.*;

public class PerfectNumber {


	public static void main(String[] args) {
		println("PerfectNumber");
		print("Bitte geben Sie eine Zahl ein: ");
		
		int num = readInt();

		if (isPerfectNumber(num) == true) {
			println("ja, die eingegebene Zahl ist vollkommen!");
		} else {
			println("nein, die eingebene Zahl ist nicht vollkommen!");
		}
	}

	/**
	 * Die Methode prüft ob die übergebene Zahl eine Perfekte Zahl ist, 
	 * indem alle natürlichen Teiler von "zahla" addiert werden.
	 * 
	 * @param zahla die Zahl deren natürlich Teiler gesucht werden.
	 * @return true/false falls die Summe der natürlichen Teiler gleich oder ungleich "zahla" ist.
	 */
	
	static boolean isPerfectNumber(int zahla) {
		int rest;
		int summe = 0;
		int teiler = 0;

		//Abbruch der Methode, falls die Zahl negativ ist.
		if (zahla <= 0) {
			throw new PRException("Eingabe ungültig / Halt Stop! Nicht mit negativen Zahlen!");
		}
		
		//Alle natürliche Teiler werden gesucht und addiert.
		while (teiler <= zahla/2) {
			teiler++;
			rest = zahla % teiler;
			if (rest == 0) {
				summe = summe + teiler;
			}
		}
		
		//Hier wird ermittelt ob die Zahl eine Perfekte Zahl ist.
		if (summe == zahla) {
			return true;
		}
		return false;
	}
}
