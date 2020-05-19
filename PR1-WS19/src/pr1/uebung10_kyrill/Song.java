package pr1.uebung10_kyrill;

import static pr.MakeItSimple.*;

public class Song {
	
	private String songName;
	private String albumName;
	private String[] artists;
	
	public Song(String songString) {
		String[] splitString = songString.split(";");
		if (splitString.length < 3) {
			throw new PRException("Wrong String format");
		}
		this.songName = splitString[0];
		this.albumName = splitString[1];
		
		String[] artists = new String [splitString.length-2];
		for(int i=0; i<artists.length; i++ ) {
			artists[i] = splitString[i+2];
		}
		this.artists = artists;
	}
	
	String getSongName() {
		return songName;
	}
	
	String getAlbumName() {
		return albumName;
	}
	
	String[] getArtists() {
		return artists;
	}
	

	String songToString() {
		String songData = ("songName = " + songName + " ||| albumName = " + albumName + " ||| artists = ");
		for(int i=0; i<artists.length ;i++) {
			songData = songData + artists[i] + " ; ";
		}
		return songData;
	}
}
