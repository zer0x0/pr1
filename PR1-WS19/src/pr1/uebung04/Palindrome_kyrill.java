package pr1.uebung04;

import static pr.MakeItSimple.*;

import pr.MakeItSimple.PRException;

public class Palindrome_kyrill {
	
	public static void main(String[] args) 
	{
		println("Palindrom");
		print("Bitte geben Sie eine Zahl ein: ");
		int num = readInt();
		if(isPalindrome(num)== true)
		{
			println("Palindrom");
		}
		else
			println("kein Palindrom");
	}
	public static boolean isPalindrome (int a)
	{
		int i = 0;
		int rest;
		int b = a;
		
		if (a < 0)
		throw new PRException ("Eingabe ungültig / Halt Stop! Nicht mit negativen Zahlen!");
		else if(a == 0)
		{
			return true;
		}
		else
		{
		while (b != 0)
		{
			b = b /10;
			i++;
		}
		
		int ii = i;
		int [] narray = new int [i];
		
		while (a != 0)
		{
			rest = a % 10;
			a = a / 10;
			i--;
			narray[i] = rest;
		}
		
		while (i < ii)
		{
			if(narray[ii-1] == narray[i])
			{
			i++;
			ii--;
			return true;
			}
			else
			return false;
		}
		return false;
		}
	}
}
