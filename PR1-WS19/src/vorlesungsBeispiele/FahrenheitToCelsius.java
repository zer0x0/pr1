package vorlesungsBeispiele;

import static pr.MakeItSimple.*;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		print("Geben Sie die Temperatur in Fahrenheit ein ");
		int gradFahrenheit = readInt();

		print("Das entspricht in Celsius ");
		println((gradFahrenheit - 32.0) * 5/9);

	}
}
