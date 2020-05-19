package pr1.uebung10;

import static pr.MakeItSimple.*;

/*
 * Ausführen unserer Funktionen
 */
public class Start {

	public static void main(String[] args) {
		println("Geben Sie den Songnamen ein: ");
		String Title = readString();
		println("Geben Sie den Albumnamen ein: ");
		String Album = readString();
		println("Geben Sie den Artistnamen ein: ");
		String Artist = readString();
		String tmpSong = Title + ";" + Album + ";" + Artist;
		Song song = new Song(tmpSong);
		println(song.toString());

		/**
		 * Liest Songs aus songs.txt
		 */
//		String[]songs = readStringArray("/Users/Komakurt/Documents/Uni/Eclipse/Git/Team-2-4/PR1-WS19/src/pr1/uebung10/songs.txt");
//		SongLinkedList list = new SongLinkedList();
//		for (String string : songs) {
//			Song song = new Song (string);
//			list.addLast(song);
//		}
//		println (list.get(0));
	}
}
