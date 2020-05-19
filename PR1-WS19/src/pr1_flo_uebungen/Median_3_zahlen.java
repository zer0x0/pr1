package pr1_flo_uebungen;

import static pr.MakeItSimple.*;

public class Median_3_zahlen {

	public static int a;
	public static int b;
	public static int c;
	public static int median;
	
	public static void main(String[] args) {
		println("Median Berechnen");
		println("Bitte geben Sie für a,b,c ganze Zahlen ein:");
		print("Für a: ");
		a = readInt();
		print("Für b: ");
		b = readInt();
		print("Für c: ");
		c = readInt();
		if ((a <= b && b <= c) || (a >= b && b >= c)) 
			median = b;
		else if ((b <= a && a <= c) || (b >= a && a >= c)) 
			median = a;
		else if ((a <= c && c <= b) || (a >= c && c >= b)) 
			median = c;

	}

}
