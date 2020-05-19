package pr1.uebung04;

import static pr.MakeItSimple.*;

public class NumberSeparator {
	
	public static void main(String[] args) {
		println("NumberSeperator");
		print("Bitte geben Sie eine Zahl ein: ");
		
		int num = readInt();
		
		println(splitNumber(num));

	}
	
	/**
	 * In der Methode zerteilt eine Zahl in Ihre Dezimalstellen und speichert jede Dezimalstelle in ein Array.
	 * Anschliessend wird das Array von min2max ausgegeben.
	 * 
	 * @param zahla wird in seine Dezimalstellen zerteilt
	 * @return einen String der das Vorzeichen und alle Dezimalstellen enthält.
	 */
	
	public static String splitNumber(int zahla) {
		int arraymax = 0;
		int rest = 0;
		String ergebnis;
		
		//Hier wird geprüft ob die Zahl positiv oder negativ ist.
		//Falls die Zahl exakt 0 ist wird die Mehtode beendet.
		if (zahla < 0) {
			ergebnis = ("-");
		} else if (zahla == 0) {
			ergebnis = "+,0";
			return ergebnis;
		} else
			ergebnis = ("+");
	

		int zahlb = zahla;
		
		//Hier wird die maximale größe des Arrays bestimmt.
		while (zahlb != 0) {
			zahlb = zahlb / 10;
			arraymax++;
		}
		
		int arraymin = arraymax;
		int[] narray = new int[arraymax];
		
		//Hier wird die Zahl in ihre Dezimalstellen zerteilt und in unser Array abgespeichert.
		if (zahla > 0) {
			while (arraymin != 0) {
				rest = zahla % 10;
				zahla = zahla / 10;
				arraymin--;
				narray[arraymin] = rest;
			}
		} else {
			//Hier wird die "negative" Zahl in ihre Dezimalstellen zerteilt und in unser Array abgespeichert.
			while (arraymin != 0) {
				rest = (zahla % 10)* (-1);
				zahla = zahla / 10;
				arraymin--;
				narray[arraymin] = rest;
			}
		}
	
		//Hier wird der Inhalt des Arrays in einen String umgewandelt.
		while (arraymax != arraymin) {
			 ergebnis = ergebnis + ("," + narray[arraymin]);
			arraymin++;
		}
		return ergebnis;
	}
}
