package pr1_flo_uebungen;

import static pr.MakeItSimple.*;

public class Caesar_Cipher {

	/**
	 * Liste (Array) mit allen Buchstaben:
	 */

	public static char[] abc = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	/**
	 * Funktion, die Buchstaben in Zahlen umwandelt
	 * 
	 * @param buchstabe
	 * @return
	 */

	public static int buchstabeZuZahl(char buchstabe) {

		/**
		 * geht alle Buchstaben des Alphabets durch...
		 */

		for (int i = 0; i < 26; i = i + 1) {

			/**
			 * und wenn der Buchstabe der Gesuchte ist...
			 */

			if (abc[i] == buchstabe) {

				/**
				 * ... gib die Zahl zurück...
				 */

				return i;
			}
		}

		/**
		 * Wenn der Buchstabe nicht gefunden wurde, beende das Programm...
		 */

		System.exit(0);
		return 0;
	}

	/**
	 * Funktion, die Zahl in Buchstabe umwandelt...
	 * 
	 * @param b
	 * @return
	 */

	public static char zahlZuBuchstabe(int b) {

		/**
		 * gibt den Buchstaben an der Stelle b zurück...
		 */

		return abc[b];
	}

	/**
	 * 
	 * Beginn Hauptprogramm
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/**
		 * Der zu verschlüsselnde Text...
		 */

		String text = "";

		/**
		 * um wieviel Zeichen verschoben wird...
		 */

		int verschiebung = 0;

		println("Verschlüssle \"" + text + "\" mit einer Verschiebung von " + verschiebung);

		/**
		 * verschlüsselt den Text...
		 */

		String ausgabe = encrypt(text, verschiebung);
		println("Verschlüsselter Text: " + ausgabe);

		/**
		 * entschlüsselt durch eine verschiebung von -3 nach rechts, also 3 nach
		 * links...
		 */

		String ausgabe2 = encrypt(ausgabe, -3);
		println("Entschlüsselter Text mit richtigem Schlüssel: " + ausgabe2);

		/**
		 * entschlüsselt durch eine Verschiebung von -2 nach rechts, also 2 nach
		 * links... da es der falsche Schlüssel ist, kommt nicht der Ausgangstext
		 * heraus... keine erfolgreiche Entschlüsslung
		 */

		String ausgabe3 = encrypt(ausgabe, -2);
		println("Entschlüsselter Text mit falschem Schlüssel: " + ausgabe3);

	}

	/**
	 * Funktion, die den Text verschlüsselt oder entschlüsselt:
	 * 
	 * public = kann von überall aus aufgerufen werden... static = ist eine
	 * statische Funktion und kann damit direkt ohne Startklasse ausgeführt
	 * werden... String = der Rückgabetyp der Funktion, in diesem Fall ein Text...
	 */

	public static String encrypt(String text, int verschiebung) {

		/**
		 * der Text der nachher ausgegeben wird...
		 */

		String ausgabe = "";

		/**
		 * Schleife geht alle Zeichen durch...
		 */

		for (int i = 0; i < text.length(); i = i + 1) {

			/**
			 * der momentane Buchstabe...
			 */

			char buchstabe = text.charAt(i);

			/**
			 * gibt die Zahl des Buchstabens zurück (a = 1, b = 2, c = 3, ...)
			 */

			int bs = buchstabeZuZahl(buchstabe);

			/**
			 * verschiebt den Buchstaben...
			 */

			int neueZahl = bs + verschiebung;

			/**
			 * macht die Zahl wieder zum Buchstaben (1 = a, 2 = b, ...)
			 */

			char neuerBuchstabe = zahlZuBuchstabe(neueZahl);

			/**
			 * fügt den verschlüsselten Buchstaben an den neuen Text an...
			 */

			ausgabe = ausgabe + neuerBuchstabe;
		}

		/**
		 * gibt den ver-/ entschlüsselten Text zurück...
		 */

		return ausgabe;
	}

}
