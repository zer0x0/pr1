package pr1.uebung10_kyrill;

import static pr.MakeItSimple.*;

public class Start {
	private static SongLinkedList playList = new SongLinkedList();


	public static void main(String[] args) {

		do {
			printMenu();

			int userInput = readInt();

			if (userInput == 1) {
				addSong();
			}
			if (userInput == 2) {
				removeSong();
			}
			if (userInput == 3) {
				showPlaylistSize();
			}
			if (userInput == 4) {
				showData();
			}
			if (userInput == 5) {
				clearPlaylist();
			}
			if (userInput == 6) {
				checkIfContains();
			}
			if (userInput == 7) {
				checkSongPos();
			}
			if (userInput == 8) {
				addTxtSongs();
			}
			if (userInput == 9) {
				println("ok, Tschüsseldorf!");
				return;
			}
		} while (true);

	}

	static void printMenu() {
		println("");
		println("Menü:");
		println("1: Füge ein Lied hinzu");
		println("2: Entferne ein Lied");
		println("3: Zeige Playlist Größe");
		println("4: Zeige LiedInfo von einer bestimmten Position");
		println("5: lösche Playlist");
		println("6: Prüfe ob Playlist ein Lied enthält");
		println("7: Zeige Lied von einer bestimmten Position");
		println("8: Füge alle Lieder von songs.txt zur Playlist");
		println("9: Exit");
	}

	static void addSong() {
		println("Nice, möchtest du einen Song hinzufügen");
		println("Bitte trage dein Lied mit folgenden Attributen ein = songName; albumName; artists");
		String userInput = readString();
		Song newSong = new Song(userInput);
		playList.addLast(newSong);
		println("Gut gemacht! Dein neues Lied ist jetzt Teil deiner Playlist");

	}
	
	static void removeSong() {
		println("Welches Lied möchtest du entfernen? (trage bitte die LiedPosition ein)");
		int userInput = readInt();
		playList.remove(userInput);
		println("Gut Gemacht!! Das Lied wurde entfernt!");
	}
	
	static void showPlaylistSize() {
		println("Die PlayListGröße ist = " + playList.size());
	}
	
	static void showData() {
		println("So du möchtest ein paar LiedInformationen? Welches Lied genau? (trage die Position des Liedes ein)");
		int userInput = readInt();
		println(playList.get(userInput).songToString());
	}
	
	static void clearPlaylist() {
		playList.clear();
	}
	
	static void checkIfContains() {
		println("Nach welchem Lied suchst du in deiner Playlist? (trage den Liednamen ein)");
		String userInput = readString();
		if (playList.contains(userInput)){
			println("JA! wir haben das Lied!");
		}
		else {
			println("Oh Nö! Sieht aus als ob wir das Lied nicht haben..");
		}
	}
	
	static void checkSongPos() {
		println("Nach welchem Lied suchst du in deiner Playlist? (trage Liednamen ein)");
		String userInput = readString();
		int songPos = playList.indexOf(userInput);
		if (songPos==-1) {
			println("Sorry, wir haben dieses Lied nicht");
		}
		else {
			println("Die Position von deinem Lied ist = " + songPos);
		}
	}
	
	static void addTxtSongs() {
		String[] songsTxt = readStringArray("C:\\Users\\kiri\\git\\Team-2-4\\PR1-WS19\\src\\pr1\\uebung10_kyrill\\songs.txt");
		for(int i=0; i<songsTxt.length; i++) {
			Song song = new Song(songsTxt[i]);
			playList.addLast(song);
		}
		println("Geschafft! die ganze .txt wurde deiner Playlist hinzugefügt!");
		
	}
	

}
