package pr1.uebung10;

import static pr.MakeItSimple.*;

/*
 * Erstellung eines Songs
 */

public class Song {

	String[] parts;
	/*
	 * Wenn Funktion glechen Namen wie Klasse hat nennt man ihn Konstruktor.
	 * Funktion schreibt den Song String in parts array. Index 0 des arrays ist der
	 * song, Index 1 ist das Album und Index 2 sind die Artists. grün= Methode
	 * dunkelblau= Datentyp lila= übergabeparameter orange= neue variable kotzgrün=
	 * methodenaufruf rot= anweisungen türkis = Strings ("") gelb = initialisierte
	 * variable
	 */

	Song(String song) {
		String last = song.substring(song.length() - 1);
		if (last.equals(";")) {
			throw new PRException("Artist fehlt");
		}

		parts = song.split(";", 3);

	}
	/*
	 * getter- Methode Funktion: return of anything auf Index 0 -> Song
	 */

	String getSongName() {
		return parts[0];
	}

	/*
	 * getter- Methode auf Index 1 -> Album
	 */

	String getAlbumName() {
		return parts[1];

	}

	/*
	 * getter- Methode gibt ein String array zurück welches die Artists enthält
	 *
	 */
	String[] getArtists() {
		String[] Artists = parts[2].split(";");
		return Artists;

	}

	/*
	 * bestimmunng der Ausgabe eines gesuchten Songs mit Hilfe einer for-Schleife
	 * werden alle Artists angezeigt.
	 */
	public String toString() {
		String Artists = "";
		for (int i = 0; i < getArtists().length; i++) {
			Artists = getArtists()[i] + " ";

		}
		return "Song: " + getSongName() + " Album: " + getAlbumName() + " Artist: " + Artists;
	}
}
