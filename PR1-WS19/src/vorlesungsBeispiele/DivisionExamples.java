package vorlesungsBeispiele;

import static pr.MakeItSimple.*;

public class DivisionExamples {

	public static void main(String[] args) {

		print("Geben Sie den Divident (Zähler) ein ");
		int divident = readInt();

		print("Geben Sie den Divisor ein ");
		int divisor = readInt();

//		if (divisor == 0)
//			println("Division durch 0 - ist nicht erlaubt!");
//		
//		else
//			println("Ergebnis " + divident + "/" + divisor + "= " + divident / divisor);

//		println(divident / divisor + " ist das Ergebnis");

//		println("Richtig? " + (1.0/3 + 1.0/3 + 1.0/3));

		if (divisor != 0)
			println("Ergebnis " + divident + "/" + divisor + "= " + divident / divisor);		
		else
			println("Division durch 0 - ist nicht erlaubt!");

	}

}
