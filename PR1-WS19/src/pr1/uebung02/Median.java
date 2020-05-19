package pr1.uebung02;

import static pr.MakeItSimple.*;

public class Median {
															//Variablen wurden deklariert
	public static int a;
	public static int b;
	public static int c;
	public static int median;
	
		public static void main(String[] args) {
		println("Median Berechnen");						//Name des Programms
		
		println("Bitte geben Sie für a,b,c ganze Zahlen ein:");
		print("Für a: ");									//Eingabe der Variablen
		a = readInt();
		
		print("Für b: ");
		b = readInt();
		
		print("Für c: ");
		c = readInt();
															//Mathematische Vergleiche um den Median zu bestimmen
		if ((a <= b && b <= c) || (a >= b && b >= c)) 
			median = b;
		else if ((b <= a && a <= c) || (b >= a && a >= c)) 
			median = a;
		else if ((a <= c && c <= b) || (a >= c && c >= b)) 
			median = c;
															//Ausgabe der Lösung
		println("Der Median der drei Zahlen lautet " + median +"!!!" );
	
		}
}