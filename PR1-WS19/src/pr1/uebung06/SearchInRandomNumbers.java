package pr1.uebung06;

import static pr.MakeItSimple.*;

import pr.MakeItSimple.PRException;

public class SearchInRandomNumbers {

	public static void main(String[] args) {
		println("SearchInRandomNumbers");
		print("Bitte geben Sie einen Zähler ein: ");
		int numberCount = readInt();
		print("Bitte geben Sie eine Zahl ein: ");
		int numberToSearch = readInt();

		// Hier wird das erste Array mit Random Numbers gefüllt.
		int[] arrayWithRandomNum = generate(numberCount);

		// Hier wird das ein zweites Array erstellt und nur nach Positionen gesucht.
		int[] narrayWithPositon = searchAll(arrayWithRandomNum, numberToSearch);
		println("\nDie gesuchte Zahl >> " + numberToSearch + " << befindet sich auf: \n");
		for (int i = 0; i < narrayWithPositon.length; i++) {
			println(narrayWithPositon[i] + " << Position im Array");
		}

		// Hier wird im ersten Array nach der letzten Position der gesuchten Zahl
		// gesucht.
		println("\nDie letzte bekannte Position lautet >> " + searchLast(arrayWithRandomNum, numberToSearch) + " <<");
		
	}

	/**
	 * Diese Methode "generate" erstellt eine Array und befüllt dieses mit
	 * Zufallszahlen
	 * 
	 * @param a ist die Größe des Arrays
	 * @return wird ein Array mit "a" vielen Zufallszahlen zwischen 1 - 1000
	 */

	public static int[] generate(int num2Search) {

		// Abbruch falls das Array kleiner als 0 sein soll.
		if (num2Search < 0)
			throw new PRException("Bitte geben Sie eine Zahl ein die größer ist als 0! >> generate <<");

		// Hier wird das Array mit Random Numbers befüllt.
		int[] NumArrayRandom = new int[num2Search];
		for (int i = 0; i < num2Search; i++) {
			NumArrayRandom[i] = (int) (Math.random() * 1000) + 1;
		}
		return NumArrayRandom;
	}

	/**
	 * Diese Methode "searchAll" durchsucht das ersellte Array nach der gesuchten
	 * Zahl und erstellt ein Array mit exakt der Anzahl an Speichern wie die
	 * gesuchte Zahl gefunden wurde. Dann wird in das neue Array die Position der
	 * gesuchten Zahl gespeichert
	 * 
	 * @param num            die gesuchte Zahl
	 * @param NumArrayRandom das Array mit den num*vielen Zufallszahlen
	 * @return wird ein Array welche die Positonen der gesuchten Zahl enthält
	 */

	public static int[] searchAll(int[] NumArrayRandom, int num) {
		int counter = 0;
		// Hier bestimmten wir die größe des PostionArrays
		for (int i = 0; i < NumArrayRandom.length; i++) {
			if (NumArrayRandom[i] == num) {
				counter++;
			}
		}

		int[] arrayWithPositon = new int[counter];
		counter = 0;
		// Hier befüllen wir unser PostionArray mit den hits aus dem RandomArray die
		// wir gefunden haben.
		for (int i = 0; i < NumArrayRandom.length; i++) {
			if (NumArrayRandom[i] == num) {
				arrayWithPositon[counter] = i;
				counter++;
			}
		}
		return arrayWithPositon;
	}

	/**
	 * Diese Methode durchsucht das Array nach der letzten Position der gesuchten
	 * Zahl und gibt deren Position zurück.
	 * 
	 * @param NumArrayRandom ist das Array mit den Positionen der geuschten Zahl
	 * @param num            ist die gesuchte Zahl "numberToSearch"
	 * @return gibt die letzte gefunde Position der gesuchten Zahl zurück
	 */

	public static int searchLast(int[] NumArrayRandom, int num) {
		int found =-1;

		// Hier wird das RandomArray erneut nach der geschten Zahl durchsucht.
		for (int i = 0; i < NumArrayRandom.length; i++) {
			if (NumArrayRandom[i] == num) {
				found = i;
				println("found: " + found);
			}
		}


		if (found ==-1 )
			throw new PRException("Die Gesuchte Zahl wurde im Array nicht gefunden. Sry :/ ");
		return found;
	}

}
