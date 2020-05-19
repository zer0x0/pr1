package vorlesungsBeispiele;

import static pr.MakeItSimple.*;


public class ProgrammMitVariable {
	
	public static void main(String[] args) {
		
		String firstName;
		println("Name eingeben ");
		firstName  = readString();
		
		println("Guten Morgen " + firstName);
		
		println("Hast Du heute etwas besonderes vor " + firstName + "?");

	}

}
