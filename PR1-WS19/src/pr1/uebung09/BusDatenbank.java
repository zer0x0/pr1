package pr1.uebung09;

import static pr.MakeItSimple.*;

public class BusDatenbank {

//	private String modellbezeichnung;
//	private int sitzplätze;
//	private int stehplätze;
//	private int linie;

	public static void main(String[] args) {

	}

	static void speichereBus(Bus neuerBus) {
		Bus[] BusDatenbank = new Bus[100];

		for (int i = 0; i < BusDatenbank.length; i++)
			if (i < BusDatenbank.length) {
				BusDatenbank[i] = neuerBus;
			} else {
				throw new PRException("BusDatenbank ist voll !");
			}
	}
	static boolean busExistiert(int linie) {
	
		return false;
		
	}
}
