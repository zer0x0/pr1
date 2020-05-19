package pr1.uebung03;

import static pr.MakeItSimple.*;

public class Dividers_Kyrill {
	
	//Variablen
	static int zahl = 0;
	static int i = 0;
	static int sum = 0;
	
	public static void main(String[] args) {
		
		println("Dividers");
		println("Bitte geben Sie eine ganze Zahl ein.");
		print("Zahl: ");
		
		
		zahl = readInt();
		
		if (zahl < 0) 
		{
			print("Bitte geben Sie eine Zahl positive natürliche Zahl ein");
			
		}
		else 
		{
			print("Die natürlichen Teiler der Zahl " + zahl + " lauten: ");
			while (zahl != i) 												//Schleifen Anfang,
																		//Abbruchbedingung lautet: Wiederhole so lange bis i = zahl 
			{
				i++; 														//Laufvariable i, zählt nach jedem durchlauf i+1
			
			
				sum = zahl/i;												//Mathematische Gleichung:
																		//variable "zahl" geteilt durch i=1 beim 1. durchlauf
																		//variable "zahl" geteilt durch i=2 beim 2. durchlauf
		
			
			if (zahl%i==0)												//Prüfe ob aus der Rechnung "zahl" geteilt durch "i" ein Rest entsteht, 
																		//falls der Rest = 0 ist dann gib mir die Zahl aus
			{
				print(i + " ");											//Ausgabe der natürlichen Teiler
			}
			
		}																//Schleifen Ende
	}
}
}
	

