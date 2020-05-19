package EmailAdminApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String defaultPasswordLength;
	public String password;
	private String department;
	private String email;
	public int mailboxCapacity = 500;
	public String alternateEmail;
	private String companySuffix = "hs-mannheim.de";

	/*
	 * Konstruktor um den ersten und 2. Namen zu bekommen
	 */

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.print("\n");
		System.out.println(this.firstName + " " + this.lastName);
		System.out.print("\n");

		/*
		 * Methode für Abteilung abfragen -> Abteilung zurückbekommen
		 */

		this.department = setDepartment();
		
		/*
		 * Elemente kombinieren um Email zu generieren
		 */
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
		/*
		 * Methodenaufruf welche Random Passwort zurück gibt
		 */
		
		this.defaultPasswordLength = randomPwd(64);
//		System.out.println("\nYour random >>Password<< is: " + this.defaultPasswordLength);
		
	
	}

	/*
	 * Die Abteilung erfragen
	 */

	private String setDepartment() {
		System.out.println("*** DEPARTMENT CODES ***");
		System.out.print("\n1 Student \n2 Professor \n3 Dekan\n0 none\n");
		System.out.print("\n");
		System.out.println("Enter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "stud";
		} else if (depChoice == 2) {
			return "prof";
		} else if (depChoice == 3) {
			return "dekan";
		} else {
			return "";
		}
	}

	/*
	 * Random Passwort generieren
	 */

	private String randomPwd(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!?@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}
		return new String(password);
	}

	/*
	 * Mailbox Kapazität festlegen
	 */
	 
	public void setMailboxCapacity (int capacity) {
		this.mailboxCapacity = capacity;
	}

	/*
	 * Alternative Email festlegen
	 */
	
	public void setAlternateEmail (String altEmail) {
		this.alternateEmail = altEmail;
	}

	/*
	 * Passwort ändern
	 */

	public void changePassword (String password) {
		this.password = password;
	}
	
	/*
	 * Getter für mailBoxCapacity, alternateEmail, password
	 */
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return "\n--> DISPLAY NAME: " + firstName + " " + lastName +
				"\n--> COMPANY EMAIL: " + email +
				"\n--> YOUR PASSWORD: " + defaultPasswordLength +
				"\n--> MAILBOX CAPACITY: " + mailboxCapacity +  " MB";
				
	}
}
