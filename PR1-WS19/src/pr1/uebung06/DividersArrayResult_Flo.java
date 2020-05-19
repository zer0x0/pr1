package pr1.uebung06;

import static pr.MakeItSimple.*;

import pr.MakeItSimple.PRException;

public class DividersArrayResult_Flo {
	public static void main(String[] args) {
		print("Geben Sie eine natürliche Zahl <= 500 ein: ");
		int param = readInt();
		int counter = 1;

		// Exception handling: Wert > 500 && Wert < 0;

		if (param <= 0 || param > 500) {
			throw new PRException("Eingabe ungültig / Halt Stop! Nicht mit negativen Zahlen oder Zahlen > 500");
		} else {
			int[] paramArray = calculateDividers(param);

			// Ausgabe vom Index des paramArray;

			print("Die natürlichen Teiler der Zahl " + param + " lauten: ");

			// Ausgabe von dem sinnvollen Inhalt des paramArrays;

			while (counter < param) {
				if (paramArray[counter] > 0) {
					print(paramArray[counter] + " ");
				}
				counter++;
			}
		}

	}

	/**
	 * Berechnung des natürlichen Teilers mit Hilfe der Modulofunktion;
	 * 
	 * @param n Eingabe der Natürliche Zahl;
	 * @return Ausgabe eines Arrays der natürlichen Teiler;
	 */

	public static int[] calculateDividers(int n) {
		int[] paramArray = new int[500];
		int natürlicherTeiler = 1;
		int arrayCounter = 0;

		while (n != natürlicherTeiler) {
			natürlicherTeiler++;

			// Wernn Modulo = 0 -> natürlicher Teiler;

			if (n % natürlicherTeiler == 0) {
				paramArray[arrayCounter] = natürlicherTeiler;
				arrayCounter++;
			}
		}
		return paramArray;
	}
}
