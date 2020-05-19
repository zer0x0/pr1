package pr1.uebung03;

import static pr.MakeItSimple.*;

public class Dividers 
{
	
	static int num = 0;
	static int i = 0;
	static int sum = 0;
	static boolean legit_number = false;
	
	public static void main(String[] args) 
	{
		
		println("Dividers");
		println("Bitte geben Sie eine ganze Zahl ein.");
		print("Zahl: ");
		num = readInt();
		
		while (!legit_number) 
		{
			if (num <= 0)
			{	
				print("Bitte geben Sie eine positive natürliche Zahl ein: ");
				num = readInt();
			}
			else
			{
				print("Die natürlichen Teiler der Zahl " + num + " lauten: ");
				legit_number = true;
				while (num != i) 																										 
				{
					i++; 														
					sum = num/i;																						
					if (num%i==0)												 												
					{
						print(i + " ");											
					}
				}
			}		
		}
	}
}
	

