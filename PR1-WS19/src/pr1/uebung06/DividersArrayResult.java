package pr1.uebung06;

import static pr.MakeItSimple.*;

public class DividersArrayResult {

	public static void main(String[] args) {
		println("DividersArrayResult");
		print("Bitte geben Sie eine Zahl ein: ");
		int numberToSearch = readInt();
		// Hier wird kontrolliert ob die Zahl gültig ist.
		if (numberToSearch <= 0) {
			throw new PRException("Eingabe ungültig / Halt Stop! Nicht mit negativen Zahlen!");
		}
		int[] numberArray = calculateDividers(numberToSearch);
		// Hier wird das Array erneut abgelaufen und befüllten Felder ausgegeben.
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] != 0) {
				print(numberArray[i] + " ");
			}
		}
	}

	/**
	 * In diser Methode werden die natürlichen Teiler einer Zahl ermittelt und in
	 * einem Array wieder zurückgegeben Das Array muss 500 Felder besitzen.
	 * 
	 * @param n ist eine natürliche Zahl, deren Teiler wir kalkulieren.
	 * @return ein int [] Array, welches alle natürlichen Teiler der gesuchten Zahl enthält.
	 *         
	 */

	public static int[] calculateDividers(int n) {
		int[] paramArray = new int[500];
		int natürlicherTeiler = 0;
		int arrayCounter = 0;

		while (n != natürlicherTeiler) {
			natürlicherTeiler++;

			// Wenn Modulo = 0 -> natürlicher Teiler;
			if (n % natürlicherTeiler == 0) {
				paramArray[arrayCounter] = natürlicherTeiler;
				arrayCounter++;
			}
		}
		return paramArray;
	}

}
