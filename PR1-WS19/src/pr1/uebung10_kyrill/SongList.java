package pr1.uebung10_kyrill;

public interface SongList {
	
	/**
	 * Fuegt den neuen Song an das Ende der Liste an.
	 */
	void addLast(Song s);
	
	/**
	 * Loescht den Knoten an der angegebenen Position aus der Liste;
	 * dabei hat die erste Listenposition die Positionsnummer 0.
	 * @throws PRException wenn die Positionsangabe ungueltig ist.
	 */
	void remove(int position);
	
	/**
	 * Liefert die Anzahl der gespeicherten Songs.
	 */
	int size();
	
	/**
	 * Liefert den Song an der angegebenen Position der Liste;
	 * dabei hat die erste Listenposition die Positionsnummer 0.
	 * @throws PRException wenn die Positionsangabe ungueltig ist.
	 */
	Song get(int position);
	
	/**
	 * Entfernt alle Knoten aus der Liste
	 */
	void clear();
	
	/**
	 * Liefert genau dann true, wenn mindestens ein Song mit dem
	 * angegebenen Namen in der Liste enthalten ist, sonst false
	 */
	boolean contains(String songName);
	
	/**
	 * Liefert die erste Position in der Liste, an der ein Song
	 * mit dem angegebenen Namen enthalten ist;
	 * dabei hat die erste Listenposition die Positionsnummer 0.
	 * Wird kein Song mit dem angegebenen Namen gefunden, liefert
	 * die Methode -1 als Ergebnis.
	 */
	int indexOf(String songName);
	
}