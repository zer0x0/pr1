package pr1.uebung10_kyrill;

import pr.MakeItSimple.PRException;

public class SongArrayList implements SongList {

	SongArrayListNode head = null;

	public boolean isEmpty() {
		return head == null;
	}

	public void addLast(Song s) {

		SongArrayListNode current = head;
		SongArrayListNode butLast = null;

		while (current != null) {
			butLast = current;
			current = current.getNext();
		}

		SongArrayListNode newNode = new SongArrayLinkedListNode(s, null);

//		if (butLast == null)
//			head = newNode;
//		else
//			butLast.setNext(newNode);

		if (isEmpty())
			head = newNode;
		else
			butLast.setNext(newNode);

	}

	public void remove(int position) {
		if (isEmpty()) {
			throw new PRException("Postition ung�ltig");
		}
		
		SongArrayListNode current = head;
		SongArrayListNode butLast = null;

		
		for (int i = position; i > 0; i--) {
			butLast = current;
			current = current.getNext();
			if (current == null) {
				throw new PRException("Postition ung�ltig");
			}
		}
		current = current.getNext();
		butLast.setNext(current);
	}

	public int size() {

		SongArrayListNode current = head;

		int i = 0;
		while (current != null) {
			current = current.getNext();
			i++;
		}
		return i;

	}

	public Song get(int position) {
		if (isEmpty()) {
			throw new PRException("Postition ung�ltig");
		}

		SongArrayListNode current = head;

		for (int i = position; i > 0; i--) {
			current = current.getNext();
			if (current == null) {
				throw new PRException("Postition ung�ltig");
			}
		}
		return current.getSong();

	}

	public void clear() {
		head = null;
	}

	public boolean contains(String songName) {

		SongArrayListNode current = head;

		while (current != null) {
			if (current.getSong().getSongName() == songName) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public int indexOf(String songName) {
		SongArrayListNode current = head;

		int i = 0;
		while (current != null) {
			if (current.getSong().getSongName() == songName) {
				return i;
			}
			current = current.getNext();
			i++;
		}
		return -1;
	}

}