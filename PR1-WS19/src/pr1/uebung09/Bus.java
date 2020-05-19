package pr1.uebung09;

import static pr.MakeItSimple.*;

public class Bus {
	
	private String modellbezeichnung;
	private int sitzplätze;
	private int stehplätze;
	private int linie;
	
	Bus (String modellbezeichnung, int sitzplätze, int stehplätze, int linie) {
		this.modellbezeichnung = modellbezeichnung;
		this.sitzplätze = sitzplätze;
		this.stehplätze = stehplätze;
		this.linie = linie;		
	}
	
	void printIt () {
		print ("Modell: " + modellbezeichnung);
		print (", Sitzplätze: " + sitzplätze);
		print (", Stehplätze: " + stehplätze);
		println (", Linie: " + linie);
	}

	public void main(String[] args) {
		Bus myBus = new Bus ("M1", 45, 10, 9);
		BusDatenbank.speichereBus(myBus);
		BusDatenbank.busExistiert(linie);
		myBus.printIt();
	}

}
