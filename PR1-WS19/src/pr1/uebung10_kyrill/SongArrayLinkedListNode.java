package pr1.uebung10_kyrill;

public class SongArrayLinkedListNode {

//	the Node needs a Song and a reference to the next Song
	private Song song;
	private SongArrayLinkedListNode next;

	
//	constructor with Song and reference to the next song
	public SongArrayLinkedListNode(Song song, SongArrayLinkedListNode next) {
		this.song = song;
		this.next = next;
	}

//	getNext returns the next Node
	SongArrayLinkedListNode getNext() {
		return next;
	}

//	setNext sets the chosen Node to be the reference to he next node (after Song "Node" comes this Node)
	void setNext(SongArrayLinkedListNode node) {
		this.next = node;
	}

//	returns the Song of the Node
	Song getSong() {
		return song;
	}

}
