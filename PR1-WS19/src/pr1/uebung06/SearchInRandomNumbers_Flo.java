package pr1.uebung06;

import static pr.MakeItSimple.print;
import static pr.MakeItSimple.println;
import static pr.MakeItSimple.readInt;

import pr.MakeItSimple.PRException;

public class SearchInRandomNumbers_Flo {
	public static void main(String[] args) {
		print("Geben Sie die Anzahl der Zufallszahlen ein: ");
		int numberCount = readInt();
		print("Geben Sie die gesuchte Zahl ein: ");
		int numberToSearch = readInt();
		int[] paramArray = generate(numberCount);
		int[] foundArray = searchAll(numberToSearch, paramArray);
		print("Die gesuchte Zahl >> " + numberToSearch + " << befindet sich auf Platz: ");
		int counter = 0;
		while (counter < foundArray.length) {
			print(foundArray[counter]);
			counter++;
		}
		int lastPosition = searchLast(paramArray, numberToSearch);

		// Wenn negativ dann nix gefunden;

		if (lastPosition >= 0) {
			// print("Die letzte gefundene Position ist: " + lastPosition);
			println("\nDie letzte bekannte Position lautet >> " + searchLast(paramArray, numberToSearch) + " <<");
		}
	}

	/**
	 * Methode generiert Array der Länge n mit Zufallszahlen || falls n negativ ->
	 * Exception Handling!;
	 * 
	 * @param n -> Anzahl der Zufallszahlen;
	 * @return -> Array mit Zufallszahlen;
	 */
	public static int[] generate(int n) {
		int[] paramArray = new int[n];
		int count = 0;
		if (n >= 0) {
			while (count < n - 1) {
				paramArray[count] = (int) (Math.random() * 1000) + 1;
				count++;
			}
		} else {
			throw new PRException("Eingabe ungültig / Halt Stop! Nicht mit negativen Zahlen ");
		}
		return paramArray;

	}

	/**
	 * -> Methode zählt die gefundenen Stellen, erstellt neues Array mit Länge der
	 * TOTAL gefundenen Stellen; -> füllt das Array mit den gefundenen Positionen;
	 * 
	 * @param n      -> gesuchte Zahl;
	 * @param arrayN -> Array mit Zufallszahlen
	 * @return -> Array mit gefundenen Positionen der Zahl;
	 */
	public static int[] searchAll(int n, int[] arrayN) {
		int counter = 0;
		int secCounter = 0;
		int numberFound = 0;
		while (counter < arrayN.length) {
			if (arrayN[counter] == n) {
				numberFound++;
			}
			counter++;
		}
		int[] positionFoundArray = new int[numberFound];
		counter = 0;

		/**
		 * secCounter -> iteriert über arrayN; counter -> Index für Array mit gefundenen
		 * Stellen
		 */

		while (secCounter < arrayN.length) {
			if (arrayN[secCounter] == n) {
				positionFoundArray[counter] = secCounter;
				counter++;
			}
			secCounter++;
		}
		return positionFoundArray;
	}

	/**
	 * Methode sucht letzte bekannte Stelle der gesuchten Zahl im Array -> falls
	 * Zahl nicht enthalten -> Exception Handling -> return -1;
	 * 
	 * @param n      -> gesuchte Zahl;
	 * @param arrayN -> arrayN mit Zufallszahlen;
	 * @return -> letzte gefundene Position im Array;
	 */
	public static int searchLast(int[] arrayN, int n) {
		int found = 0;
		// Hier wird das RandomArray erneut nach der gesuchten Zahl durchsucht.
		for (int counter = 0; counter < arrayN.length; counter++) {
			if (arrayN[counter] == n) {
				found = counter;
			}
		}

		if (found == 0)
			throw new PRException("Die Gesuchte Zahl wurde im Array nicht gefunden. Sry :/ ");
		return found;
	}
}
