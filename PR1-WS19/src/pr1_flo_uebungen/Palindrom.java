package pr1_flo_uebungen;

import static pr.MakeItSimple.*;

public class Palindrom {

	public static void main(String[] args) {
		println("Wieviele Zahlen soll das Feld fassen? ");
		int anzahlDezimalen = readInt();
		int[] zahlen = new int[anzahlDezimalen];

		for (int i=0; i<zahlen.length;i++) {
			println("Geben Sie eine Zahl ein die überprüft werden soll: ");
			zahlen[i]=readInt();
		}
		
		boolean palindrom = true;
		int links = 0;
		int rechts = zahlen.length-1;
		
		while (palindrom && links<=rechts) {
		
			palindrom = (zahlen[links] == zahlen[rechts]);
			links++;
			rechts--;	
		}
		println("Palindrom: " + palindrom);
	}

	}


