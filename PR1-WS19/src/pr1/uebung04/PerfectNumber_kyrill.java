package pr1.uebung04;

import static pr.MakeItSimple.*;

public class PerfectNumber_kyrill {

	public static void main(String[] args) {
		println("Perfekte zahl ermitteln");
		print("Bitte geben Sie eine Zahl ein: ");
		int num = readInt();
		
		if (isPerfectNumber(num) == true)
		{
			println("ja, die eingegebene Zahl ist vollkommen!");
		}
		else 
		{
			println("nein, die eingebene Zahl ist nicht vollkommen!");
		}
	}


	static boolean isPerfectNumber (int a) {
		int rest;
		int sum = 0;
		int i = 0;
		
		if (a < 0)
		{
			throw new PRException ("Eingabe ungültig / Halt Stop! Nicht mit negativen Zahlen!");
		}
		while (i != a) 
		{
			i++;
			rest = a % i;
			if (rest == 0) 
			{
			sum = sum + i;
			}
		}
		if ( sum-a == a )
		{
		return true;
		}
		return false;
	}
}
