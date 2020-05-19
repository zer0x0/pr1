package pr1.uebung10_kyrill;

import pr.MakeItSimple.PRException;

public class SongLinkedList implements SongList {

	SongArrayLinkedListNode head = null;

	public boolean isEmpty() {
		return head == null;
	}

	public void addLast(Song s) {

		SongArrayLinkedListNode current = head;
		SongArrayLinkedListNode butLast = null;

		while (current != null) {
			butLast = current;
			current = current.getNext();
		}

		SongArrayLinkedListNode newNode = new SongArrayLinkedListNode(s, null);

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
			throw new PRException("Wrong position, position doesn't exist");
		}
		
		if (position == 0) {
			head=head.getNext();
		}
		
		else {
		SongArrayLinkedListNode current = head;
		SongArrayLinkedListNode butLast = null;
			
		
		for (int i = position; i > 0; i--) {
			butLast = current;
			current = current.getNext();
			if (current == null) {
				throw new PRException("Wrong position, position doesn't exist");
			}
		}
		current = current.getNext();
			butLast.setNext(current);
		}
	}

	public int size() {

		SongArrayLinkedListNode current = head;

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

		SongArrayLinkedListNode current = head;

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

		SongArrayLinkedListNode current = head;

		while (current != null) {
			if (current.getSong().getSongName().equals(songName)) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public int indexOf(String songName) {
		SongArrayLinkedListNode current = head;

		int i = 0;
		while (current != null) {
			if (current.getSong().getSongName().equals(songName)) {
				return i;
			}
			current = current.getNext();
			i++;
		}
		return -1;
	}

}
