package pr1.uebung10;

import static pr.MakeItSimple.*;

import java.util.ArrayList;

/* Verwaltung von mehreren Songs mit Hilfe einer Liste
 * 
 * implementiert SongList Interface. Nutzt ausschließlich die Methoden welche in dem Interface SongList konfiguriert wurden.
 * Erkennbar durch @override !!!
 */

public class SongLinkedList implements SongList {

	/*
	 * Arraylist= kann Liste mit Daten enthalten, inhalt von <> ist Datentyp der
	 * gespeicherten Daten (Objekt Song) türkis= name der Liste rot= anweisung
	 * Kotzgrün= Methodenaufruf (Konstruktoraufruf)
	 */
	ArrayList<Song> songListe = new ArrayList<>();

	/*
	 * Fuegt den neuen Song an das Ende der Liste an.
	 */

	@Override
	public void addLast(Song s) {
		songListe.add(s);

	}

	/**
	 * Loescht den Knoten an der angegebenen Position aus der Liste; dabei hat die
	 * erste Listenposition die Positionsnummer 0.
	 * 
	 * @throws PRException wenn die Positionsangabe ungueltig ist.
	 */

	@Override
	public void remove(int position) {
		if (position < 0 || position > size()) {
			throw new PRException("Positionsangabe ungültig");
		} else {
			songListe.remove(position);
		}

	}

	/**
	 * Liefert die Anzahl der gespeicherten Songs.
	 */

	@Override
	public int size() {
		return songListe.size();
	}

	/**
	 * Liefert den Song an der angegebenen Position der Liste; dabei hat die erste
	 * Listenposition die Positionsnummer 0.
	 * 
	 * @throws PRException wenn die Positionsangabe ungueltig ist.
	 */

	@Override
	public Song get(int position) {
		if (position < size()) {
			return songListe.get(position);
		} else {
			throw new PRException("Positionsangabe ungültig");

		}
	}

	/**
	 * Entfernt alle Knoten aus der Liste
	 */

	@Override
	public void clear() {
		songListe.clear();

	}

	/**
	 * Liefert genau dann true, wenn mindestens ein Song mit dem angegebenen Namen
	 * in der Liste enthalten ist, sonst false
	 */

	@Override
	public boolean contains(String songName) {
		for (Song song : songListe) {
			if (song.getSongName().equals(songName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Liefert die erste Position in der Liste, an der ein Song mit dem angegebenen
	 * Namen enthalten ist; dabei hat die erste Listenposition die Positionsnummer
	 * 0. Wird kein Song mit dem angegebenen Namen gefunden, liefert die Methode -1
	 * als Ergebnis.
	 */
	/*-> public = Sichtbarkeit der Methode
	 * int = Rückgabewert (Ganzzahlig)
	 * indexOf = Name der Methode 
	 * songName = Übergabeparameter 
	 * String = Datentyp des Übergabeparameters songName
	 * Int = Datentyp vom Index 
	 * Index = Variable 
	 * 0 = Index wird 0 gesetzt
	 * for Schleife...
	 * Song = Datentyp
	 * song = Variable vom Datentyp Song
	 * songListe = ArrayList
	 * if....
	 * song = initialisierte Variable des Datentyps Song
	 * getSongName() = Methodenaufruf
	 * .equals(songName) = Methodenaufruf um zwei Strings zu vergleichen (returnwert getSongName() == songName)
	 * return = Anweisung
	 * Index = Variable
	 * 
	 */

	@Override
	public int indexOf(String songName) {
		int Index = 0;
		for (Song song : songListe) {
			if (song.getSongName().equals(songName)) {
				return Index;

			}
			Index++;
		}
		return -1;
	}

}
