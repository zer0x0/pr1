package BankingApp;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {

		BankAccount obj1 = new BankAccount("Florian Kaffenberger", "CZ-1890-A");
		obj1.showMenu();

	}

}

class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	private Scanner scanner;

	/*
	 * Konstruktor
	 */

	BankAccount(String cname, String cid) {

		customerName = cname;
		customerID = cid;

	}

	/*
	 * Einzahlungen auf BankAccount
	 */

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	/*
	 * Auszahlungen von BankAccount
	 */

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	/*
	 * Vorherige Trasaktion des BankAccount
	 */

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposit: " + previousTransaction + "€");
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction) + "€");
		} else {
			System.out.println("No transaction occured.");
		}

	}

	/*
	 * Menügestaltung
	 */

	void showMenu() {

		/*
		 * char wird bei position 0 belegt mit User Eingabe (scanner.in)
		 */

		char option = '\0';
		scanner = new Scanner(System.in);

		/*
		 * Anzeige des Menüs
		 */

		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is " + customerID);
		System.out.println("\n");
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withdraw");
		System.out.println("D: Previous transaction");
		System.out.println("E: Exit");

		/*
		 * Auswahl der verschiedenen Möglichkeiten im Menu
		 */

		do {
			System.out.println(
					"==========================================================================================================");
			System.out.println("Enter an option");
			System.out.println(
					"==========================================================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");

			/*
			 * Verschiedene Möglichkeiten im Men
			 */

			switch (option) {

			case 'A':
				System.out.println("------------------------------------");
				System.out.println("Balance = " + balance + "€");
				System.out.println("------------------------------------");
				System.out.println("\n");
				break;

			case 'B':
				System.out.println("------------------------------------");
				System.out.println("Enter an amount to deposit:");
				System.out.println("------------------------------------");

				/*
				 * Input wird eingelesen und in der deposit methode verwendet
				 */

				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;

			case 'C':
				System.out.println("------------------------------------");
				System.out.println("Enter amount of withdraw:");
				System.out.println("------------------------------------");

				/*
				 * Input wird eingelesen und von der withdraw methode verwendet
				 */

				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;

			case 'D':
				System.out.println("------------------------------------");

				/*
				 * Methode getPreviousTransaction wird aufgerufen
				 */

				getPreviousTransaction();
				System.out.println("------------------------------------");
				System.out.println("\n");
				break;

			case 'E':
				System.out.println("****************************************");
				break;

			/*
			 * wird ein CHARakter eingegeben der nicht in als case angegeben ist so wird
			 * Invalid Option.. ausgegeben
			 */

			default:
				System.out.println("Invalid Option ! Please enter again.");
				break;
			}

			/*
			 * Loop wird beendet wenn E eingegeben wird
			 */

		} while (option != 'E');

		System.out.println("Thank you for using our services");
	}

}
