package pr1.uebung05;
import static pr.MakeItSimple.*;

public class Fibonacci_kyrill {

	public static void main(String[] args)
	{
		
		println("Fibonacci");
		print("Wie viele Fibonacci Zahlen möchten Sie sehen?: ");
		int anzahlErgebnise = readInt();
		int ii = 0;
		int [] ergebnis;
		ergebnis = calculateFibonacci(anzahlErgebnise);
		
		print("Fibonacci-Folge: ");
		
		if (anzahlErgebnise == 1)
		{
			print(ergebnis[0]);
		}
		else
		{
			while (ii != anzahlErgebnise)
			{
				print(ergebnis[ii] + " ");
				ii++;
			}
		}
	}
	
	public static int[] calculateFibonacci (int num) {
		int [] narray;
		int a = 0;
		int b = 1;
		int c = 0;
		int i = 2;
		
		if (num <= 0)
			throw new PRException ("Eingabe ungültig / Halt Stop! Nicht mit negativen Zahlen!");
		else if (num == 1)
		{
			narray = new int [num];
			narray[0] = a;
			return narray;
		}
		else
		{
			narray = new int [num];
			narray[0] = a;
			narray[1] = b;
		
		while (i != num)
		{
			c = a + b;
			narray[i] = c;
			a = b;
			b = c;
			i++;
		}
		return narray;
		}
	}
}
