package pr1.uebung07;

import static pr.MakeItSimple.*;

public class VierGewinnt_Flo {

	/**
	 * Main
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		println("Willkommen bei \"Vier Gewinnt!\"");
		println();
		println("Spiel beginnen: [1]");
		println("Spiel beenden:  [beliebige Eingabe]");
		
		/**
		 * Spielfeld wird bei der Eingabe von [1] initialisiert ansonsten
		 * system.exit.(0).
		 */
		
		int eingabe = readInt();
		char[][] spielfeld = { { ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };

		if (eingabe == 1) {
			printSpielfeld(spielfeld);
		} else {
			System.exit(0);
		}
		
		/**
		 * Spiel beginnt immer mit Spieler 1 !! Aufruf -->> Methoden in der Main
		 * (Gewinnbedingung, spalteVoll, spaltenAuswahl).
		 */
		
		println("Spieler 1 hat die roten Steine (R) - Spieler 2 hat die grünen Steine (G) !!");
		println("Es beginnt immer Spieler 1.");
		println();
		
		boolean gewonnen = false;
		while (gewonnen == false) {

			println("Spieler 1:");
			println("Bitte wählen Sie die Spalte aus! (Wert zwischen 1 und 7 )");
			int spalte = readInt();
			
			/**
			 * check ob Spalte voll ist -->> spalte-1 weil wir oben auf dem Spielfeld noch
			 * ein Spaltenindex haben und Array aber bei 0 beginnt!
			 */
			
			boolean spalteVoll = spalteVoll(spielfeld, spalte - 1);
			while (spalteVoll == true) {
				println("Spalte voll !!! Wähle eine andere Spalte aus:");
				spalte = readInt();
				spalteVoll = spalteVoll(spielfeld, spalte - 1);
			}
			
			/**
			 * Aufruf -->> Methode auswahlSpalte.
			 */
			
			int zeile = auswahlSpalte(spielfeld, spalte - 1, 'R');
			spielfeld[zeile][spalte - 1] = 'R';
			printSpielfeld(spielfeld);
			
			/**
			 * Gewinnbedingungen -->> vertikal, horizontal,diagonal backslash,diagonal slash
			 * für Spieler mit Stein 'R'.
			 */
			
			gewonnen = checkVertical(spielfeld, spalte - 1, zeile, 'R');
			if (gewonnen == true) {
				println("Herzlichen Glückwunsch, Spieler 1 hat gewonnen!!");
				break;
			}

			gewonnen = checkHorizontal(spielfeld, spalte - 1, zeile, 'R');
			if (gewonnen == true) {
				println("Herzlichen Glückwunsch, Spieler 1 hat gewonnen!!");
				break;
			}

			gewonnen = checkDiagonalBackslash(spielfeld, spalte - 1, zeile, 'R');
			if (gewonnen == true) {
				println("Herzlichen Glückwunsch, Spieler 1 hat gewonnen!!");
				break;
			}

			gewonnen = checkDiagonalSlash(spielfeld, spalte - 1, zeile, 'R');
			if (gewonnen == true) {
				println("Herzlichen Glückwunsch, Spieler 1 hat gewonnen!!");
				break;
			}

			println("Es folgt Spieler 2");
			println("Bitte wählen Sie die Spalte aus! (Wert zwischen 1 und 7 )");
			spalte = readInt();
			
			/**
			 * checkt ob Spalte voll für SPieler 2 -->> Methode spalteVoll wird ausgeführt.
			 */
			
			spalteVoll = spalteVoll(spielfeld, spalte - 1);
			while (spalteVoll == true) {
				println("Spalte voll !!! Wähle eine andere Spalte aus:");
				spalte = readInt();
				spalteVoll = spalteVoll(spielfeld, spalte - 1);
			}
			
			/**
			 * ruft -->> Methode auswahlSpalte auf für Spieler mit Stein 'G'.
			 */
			
			zeile = auswahlSpalte(spielfeld, spalte - 1, 'G');
			spielfeld[zeile][spalte - 1] = 'G';
			printSpielfeld(spielfeld);
			
			/**
			 * Gewinnbedingungen -->> vertikal, horizontal,diagonal backslash,diagonal slash
			 * für Spieler mit Stein 'G'.
			 */
			
			gewonnen = checkVertical(spielfeld, spalte - 1, zeile, 'G');
			if (gewonnen == true) {
				println("Herzlichen Glückwunsch, Spieler 1 hat gewonnen!!");
				break;
			}
			gewonnen = checkHorizontal(spielfeld, spalte - 1, zeile, 'G');
			if (gewonnen == true) {
				println("Herzlichen Glückwunsch, Spieler 1 hat gewonnen!!");
				break;
			}
			gewonnen = checkDiagonalBackslash(spielfeld, spalte - 1, zeile, 'G');
			if (gewonnen == true) {
				println("Herzlichen Glückwunsch, Spieler 1 hat gewonnen!!");
				break;
			}
			gewonnen = checkDiagonalSlash(spielfeld, spalte - 1, zeile, 'G');
			if (gewonnen == true) {
				println("Herzlichen Glückwunsch, Spieler 2 hat gewonnen!!");
			}
		}
	}

	/**
	 * Methode zur Ausgabe des Spielfelds spielfeldIndex -->> erste Reihe mit Indexzahlen von 1-7.
	 * 
	 * @param spielfeld -->> Anzahl Stellen im Array.
	 */

	public static void printSpielfeld(char[][] spielfeld) {

		// initialisieren von spielfeldIndex.

		char[] spielfeldIndex = { '1', '2', '3', '4', '5', '6', '7' };

		// Indexgestaltung.

		print("|");
		for (int i = 0; i < spielfeldIndex.length; i++) {
			print(spielfeldIndex[i] + " |");
		}
		println();
		for (int k = 0; k < spielfeldIndex.length; k++) {
			print(" --");
		}

		// Spielfeldgestaltung.

		println();
		for (int i = 0; i < spielfeld.length; i++) {
			print("|");
			for (int j = 0; j < spielfeld[i].length; j++) {
				print(spielfeld[i][j] + " |");
			}
			println();
			for (int k = 0; k < spielfeld[i].length; k++) {
				print(" --");
			}
			println();
		}

	}

	/**
	 * Methode zum checken ob Spalte (Fach) voll ist.
	 *  
	 * @param spielfeld -->> 2-Dimensionales Array.
	 * @param spalte    -->> Anzahl Stellen im zweidimensionalen Array für das Fach 1-7.
	 * @return -->> gibt false aus also Spalte nicht voll wenn noch Steine rein passen.
	 */

	public static boolean spalteVoll(char[][] spielfeld, int spalte) {
		if (spielfeld[spalte][1] == 'R' || spielfeld[spalte][1] == 'G') {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Methode zum chekcen der vertikalen Gewinnbedingung.
	 * 
	 * @param spielfeld -->> 2-Dimensionales Array.
	 * @param spalte    -->> X-Achse Spalte 1-7.
	 * @param zeile     -->> Y-Achse Zeile 1-6.
	 * @param stein     -->> Spieler 1 (R) || Spieler 2 (G).
	 * @return -->> gibt den returnwert = true zurück wenn die geschachtelte if
	 * Bedingung für die Spalte (Fach) true ist. [GEWONNEN!]
	 */

	public static boolean checkVertical(char[][] spielfeld, int spalte, int zeile, char stein) {
		boolean returnwert = false;
		if (spalte + 3 < spielfeld.length) {
			if (spielfeld[spalte][zeile] == stein && spielfeld[spalte + 1][zeile] == stein
					&& spielfeld[spalte + 2][zeile] == stein && spielfeld[spalte + 3][zeile] == stein) {
				returnwert = true;
			}
		}
		return returnwert;

	}

	/**
	 * Methode zum checken der horizontalen Gewinnbedingung.
	 * 
	 * @param spielfeld -->> 2-Dimensionales Array.
	 * @param spalte    -->> X-Achse Spalte 1-7.
	 * @param zeile     -->> Y-Achse Zeile 1-6.
	 * @param stein     -->> Spieler 1 (R) || Spieler 2 (G).
	 * @return -->> gibt den returnwert = true zurück wenn die geschachtelte if
	 * Bedingung für die Zeile true ist. [GEWONNEN!]
	 */

	public static boolean checkHorizontal(char[][] spielfeld, int spalte, int zeile, char stein) {
		boolean returnwert = false;
		if (zeile + 3 < spielfeld[spalte-1].length) {
			if (spielfeld[spalte][zeile] == stein && spielfeld[spalte][zeile + 1] == stein
					&& spielfeld[spalte][zeile + 2] == stein && spielfeld[spalte][zeile + 3] == stein) {
				returnwert = true;
			}
		}
		return returnwert;
	}

	/**
	 * Methode zum checken der Diagonalen (\) Gewinnbedingung.
	 * 
	 * @param spielfeld -->> 2-Dimensionales Array.
	 * @param spalte    -->> X-Achse Spalte 1-7.
	 * @param zeile     -->> Y-Achse Zeile 1-6.
	 * @param stein     -->> Spieler 1 (R) || Spieler 2 (G).
	 * @return -->> gibt den returnwert = true zurück wenn die geschachtelte if
	 * Bedingung für die Diagonale (\) true ist. [GEWONNEN!]
	 */

	public static boolean checkDiagonalBackslash(char[][] spielfeld, int spalte, int zeile, char stein) {
		boolean returnwert = false;
		if (spalte + 3 < spielfeld.length && zeile + 3 < spielfeld.length) {
			if (spielfeld[spalte][zeile] == stein && spielfeld[spalte + 1][zeile + 1] == stein
					&& spielfeld[spalte + 2][zeile + 2] == stein && spielfeld[spalte + 3][zeile + 3] == stein) {
				returnwert = true;
			}
		}
		return returnwert;
	}

	/**
	 * Methode zum checken der Diagonalen (/) Gewinnbedingung.
	 * 
	 * @param spielfeld -->> 2-Dimensionales Array.
	 * @param spalte    -->> X-Achse Spalte 1-7.
	 * @param zeile     -->> Y-Achse Zeile 1-6.
	 * @param stein     -->> Spieler 1 (R) || Spieler 2 (G).
	 * @return -->> gibt den returnwert = true zurück wenn die geschachtelte if
	 * Bedingung für die Diagonale (/) true ist. [GEWONNEN!]
	 */

	public static boolean checkDiagonalSlash(char[][] spielfeld, int spalte, int zeile, char stein) {
		boolean returnwert = false;
		if (spalte - 3 >= 0 && zeile + 3 < spielfeld.length) {
			if (spielfeld[spalte][zeile] == stein && spielfeld[spalte - 1][zeile + 1] == stein
					&& spielfeld[spalte - 2][zeile + 2] == stein && spielfeld[spalte - 3][zeile + 3] == stein) {
				returnwert = true;
			}
		}
		return returnwert;
	}

	/**
	 * Methode die das Auswählen der Spalte ermöglicht bis die Zeile [counter] voll
	 * ist.
	 * 
	 * @param spielfeld -->> 2-Dimensionales Array.
	 * @param spalte    -->> X-Achse Spalte 1-7.
	 * @param stein     -->> Spieler 1 (R) || Spieler 2 (G).
	 * @return -->> gibt aus welche Spalte der Spieler gewählt hat.
	 */

	public static int auswahlSpalte(char[][] spielfeld, int spalte, char stein) {
		int counter = spielfeld.length - 1;
		boolean fortsetzen = true;
		while (counter >= 0 && fortsetzen == true) {

			if (spielfeld[counter][spalte] != 'R' && spielfeld[counter][spalte] != 'G') {

				fortsetzen = false;
				return counter;

			}
			counter--;

		}
		return counter;

	}

}
