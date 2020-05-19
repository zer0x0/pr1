package pr1.uebung04;
import static pr.MakeItSimple.*;
public class NumberSeparator_kyrill {

	public static void main(String[] args) {
		print("Bitte geben Sie eine Zahl ein: ");
		int num = readInt();
		println(splitNumber(num));
		
	}
	public static String splitNumber (int a)
	{
		int i = 0;
		int rest = 0;
		String ergebnis = "";
		
		if (a < 0)
		{
			print("-");
			a = a * (-1);
		}
		else if (a == 0)
		{
			ergebnis = "+, 0";
			return ergebnis;
		} else
			print("+");
		
		int b = a;

		while (b != 0)
		{
			b = b / 10;
			i++;
		}
		
		int ii = i;
		int [] arraynum  = new int[i];
		
		while (i != 0)
		{
			rest = a % 10;
			a = a / 10;
			i--;
			arraynum[i] = rest;
		}
	
		while (i != ii)
		{
			ergebnis = ergebnis + (", " + arraynum[i]);
			i++;
		}
		return ergebnis;
	}
}
