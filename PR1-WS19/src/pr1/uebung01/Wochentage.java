package pr1.uebung01;

// Importieren von Custom Methode
import static pr.MakeItSimple.print;
import static pr.MakeItSimple.println;
import static pr.MakeItSimple.readInt;

public class Wochentage { // Name der Methode - Name des Programms

	public static void main(String[] args) {

		// Eingabe Integer für Tag, Monat und Jahr

		int v_day = 1;
		int v_month = 0;
		int v_year = 0;

		// Integer für die Formel zur berechnung des Wochentages

		int h = 0;
		int k = 0;

		// Ausgabe String ("Sonntag", "Montag", "Dienstag" usw.)

		String day = null;

		// Ein boolean Wert für die Überprüfung definiert

		boolean bool_day = true;
		boolean bool_month = true;
		boolean bool_year = true;
		boolean bool_all = true;

		// Aufforderung zur Eingabe

		println("Geben Sie das Datum mit 3 ganzen Zahlen ein (dd/mm/yyyy).");

		// Integer werden eingelesen

		while (bool_all == true) {

			while (bool_day == true) {
				print("Tag: ");
				v_day = readInt();
				if (v_day < 1 || v_day > 31) {
					println("Eingabe nicht gültig, bitte für Tag einen Wert von 1 bis 31 eingeben.");
				} else
					bool_day = false;
			}

			while (bool_month == true) {
				print("Monat: ");
				v_month = readInt();
				if (v_month < 1 || v_month > 12) {
					println("Eingabe nicht gültig, bitte für Monat einen Wert von 1 bis 12 eingeben.");
				} else
					bool_month = false;
			}

			while (bool_year == true) {
				print("Jahr: ");
				v_year = readInt();
				if (v_year < 1900 || v_year > 2019) {
					println("Eingabe nicht gültig, bitte für Jahr einen Wert von 1900 bis 2019 eingeben.");
				} else
					bool_year = false;
			}

			if ((v_month == 2) && ((v_year % 4 == 0) && ((v_year % 100 != 0 || v_year % 400 == 0))) && (v_day > 29)) {
				println("Im Schaltjahr hat Februar maximal 29 Tage, bitte Datum neu eingeben");
				bool_day = true;
				bool_month = true;
				bool_year = true;
			} else if ((v_month == 2) && !((v_year % 4 == 0) && ((v_year % 100 != 0 || v_year % 400 == 0)))
					&& (v_day > 28)) {
				println("In diesem Jahr hat Februar nur 28 Tage, bitte Datum neu eingeben");
				bool_day = true;
				bool_month = true;
				bool_year = true;
			} else if ((v_month == 4 || v_month == 6 || v_month == 9 || v_month == 11) && (v_day > 30)) {
				println("Dieser Monat hat nur 30 Tage, bitte Datum neu eingeben");
				bool_day = true;
				bool_month = true;
				bool_year = true;
			}

			else
				bool_all = false;
		}

		// Gauß - Formel

		if (v_month <= 2) {
			h = v_month + 12;
			k = v_year - 1;
		} else {
			h = v_month;
			k = v_year;
		}

		// Integer Wert des Wochentages (0 = Sonntag; 1 = Montag; ...; 6 = Samstag)

		int x = (v_day + 2 * h + (3 * h + 3) / 5 + k + k / 4 - k / 100 + k / 400 + 1) % 7;

		// Switch zur Ausgabe des Wochentages als Wort anhand des Wochentag Integers

		switch (x) {
		case 0:
			day = "Sonntag";
			break;
		case 1:
			day = "Montag";
			break;
		case 2:
			day = "Dienstag";
			break;
		case 3:
			day = "Mittwoch";
			break;
		case 4:
			day = "Donnerstag";
			break;
		case 5:
			day = "Freitag";
			break;
		case 6:
			day = "Samstag";
			break;
		}
		// Ausgabe des Wochentages

		println("Der " + v_day + "." + v_month + "." + v_year + " ist ein " + day + "!");
	}

}