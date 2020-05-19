package pr1.uebung08;

import static pr.MakeItSimple.*;

public class VierGewinnt {

	public static void main(String[] args) {
		boolean wannaPlay = true;

		while (wannaPlay) {
			Spielfeld spielfeld = new Spielfeld(6,7);
			spielfeld.play();
						
			println("1 more game? (Type Y or Yes if you want to play again)");
			String playerAnswer = readString();

			if (!playerAnswer.equals("Y") && !playerAnswer.equals("y") && !playerAnswer.equals("Yes"))
				wannaPlay = false;

		}
		println("Ok... goodbye! See you next time :)");
	}



//	 now, we create a method checking if last play is a winning play


}
