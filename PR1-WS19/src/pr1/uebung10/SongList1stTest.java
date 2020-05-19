package pr1.uebung10;

import static org.junit.Assert.*;

import org.junit.Test;

import static pr.MakeItSimple.*;

/*
 * JUnitTests
 */
public class SongList1stTest {

	private SongList list = new SongLinkedList();
//	private SongList list = new SongArrayList();

	@Test
	public void addOneElement() {
		list.addLast(new Song("s1;album;a1"));
		assertEquals(1, list.size());
		Song s = (Song) list.get(0);
		assertEquals("s1", s.getSongName());
		assertArrayEquals(new String[] { "a1" }, s.getArtists());
		assertEquals("album", s.getAlbumName());
	}

	@Test
	public void addAndGetThreeElements() {
		list.addLast(new Song("s1;album1;a1"));
		list.addLast(new Song("s2;album2;a2"));
		list.addLast(new Song("s3;album3;a3"));

		assertEquals(3, list.size());
		assertEquals("s1", ((Song) list.get(0)).getSongName());
		assertEquals("s2", ((Song) list.get(1)).getSongName());
		assertEquals("s3", ((Song) list.get(2)).getSongName());
	}

	@Test(expected = PRException.class)
	public void addEmptySecondArtist() {
		list.addLast(new Song("s1;album;a1;"));
	}

	@Test
	public void containsFirst() throws Exception {
		list.addLast(new Song("s1;album1;a1"));
		list.addLast(new Song("s2;album2;a2"));

		assertTrue(list.contains("s1"));
	}

	@Test
	public void containsNonExistingInListWithOneElement() throws Exception {
		list.addLast(new Song("s1;album1;a1"));

		assertFalse(list.contains("nicht vorhanden"));
	}

	@Test(expected = PRException.class)
	public void getOnEmpty() {
		list.get(0);
	}

	@Test
	public void deleteLeftMost() {
		list.addLast(new Song("s1;album1;a1"));
		list.addLast(new Song("s2;album2;a2"));

		list.remove(0);

		assertEquals(1, list.size());
		assertEquals("s2", ((Song) list.get(0)).getSongName());
	}

	@Test
	public void emptyOnEmpty() throws Exception {
		assertEquals(0, list.size());
	}

	@Test
	public void emptyOnNonEmpty() throws Exception {
		list.addLast(new Song("s1;album1;a1"));
		assertTrue(list.size() != 0);
	}

	@Test
	public void emptyAfterClearOnNonEmpty() throws Exception {
		list.addLast(new Song("s1;album1;a1"));

		list.clear();
		assertEquals(0, list.size());
	}

	@Test
	public void indexOfFirst() throws Exception {
		list.addLast(new Song("s1;album1;a1"));
		list.addLast(new Song("s2;album2;a2"));

		assertEquals(0, list.indexOf("s1"));
	}

	@Test
	public void indexOfNonExistingInListWithOneElement() throws Exception {
		list.addLast(new Song("s1;album1;a1"));

		assertEquals(-1, list.indexOf("nicht vorhanden"));
	}

}