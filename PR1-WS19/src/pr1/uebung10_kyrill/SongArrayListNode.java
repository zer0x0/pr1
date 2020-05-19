package pr1.uebung10_kyrill;

public class SongArrayListNode {
	

		private Song[] songArray = new Song[100];
		private SongArrayListNode nextArray;

		public SongArrayListNode(Song[] songArray, SongArrayListNode nextArray) {
			this.songArray = songArray;
			this.nextArray = nextArray;
		}

		SongArrayListNode getNextArray() {
			return nextArray;
		}

		void setNextArray(SongArrayListNode node) {
			this.nextArray = node;
		}

		Song[] getSongArray() {
			return songArray;
		}
}
