package vorlesungsBeispiele;

import static pr.MakeItSimple.*;

public class CelsiusToFahrenheit {
	
	public static void main(String[] args) {
		
		print("Das ist ein Test von K und F !");
			
		print("Geben Sie die Temperatur in Celsius ein ");
		int gradCelsius = readInt();
		
		print("Das entspricht in Fahrenheit ");
		println ( gradCelsius * (9.0/5) + 32);

	}

}
