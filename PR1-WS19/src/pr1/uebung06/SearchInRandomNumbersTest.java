    package pr1.uebung06;

    import static org.junit.Assert.*;

    import org.junit.Test;

    import pr.MakeItSimple.PRException;

    public class SearchInRandomNumbersTest {

    	/*
    	 * generate
    	 */
    	
    	@Test
    	public void positiveArrayLength() {
    		assertEquals(0, SearchInRandomNumbers.generate(0).length);
    		assertEquals(1, SearchInRandomNumbers.generate(1).length);
    		assertEquals(10000, SearchInRandomNumbers.generate(10000).length);
    	}

    	@Test(expected=PRException.class)
    	public void negativeArrayLength() {
    		SearchInRandomNumbers.generate(-1);
    	}
    	
    	@Test
    	public void randomNumberValue() throws Exception {
    		int[] numbers = SearchInRandomNumbers.generate(10000000);
    		for (int i = 0; i < numbers.length; i++) {
    			assertTrue("Position " + i + ": " + numbers[i], 1 <= numbers[i]);
    			assertTrue("Position " + i + ": " + numbers[i], numbers[i] <= 1000);
    		}
    	}
    	
    	
    	
    	
    	/*
    	 * searchAll
    	 */
    	
    	@Test
    	public void searchAll_emptyArray() throws Exception {
    		int[] numbers = new int[0];
    		assertEquals(0, SearchInRandomNumbers.searchAll(numbers, 43).length);
    	}
    	
    	@Test
    	public void searchAll_oneElementArrayWithSearchElement() throws Exception {
    		int[] numbers = new int[] {42};
    		int[] positions = SearchInRandomNumbers.searchAll(numbers, 42);
    		assertEquals(1, positions.length);
    		assertEquals(0, positions[0]);
    	}
    	
    	@Test
    	public void searchAll_oneElementArrayWithoutSearchElement() throws Exception {
    		int[] numbers = new int[] {42};
    		assertEquals(0, SearchInRandomNumbers.searchAll(numbers, 43).length);
    	}
    	
    	@Test
    	public void searchAll_searchElementAtBothEnds() throws Exception {
    		int[] numbers = new int[] {42, 1, 42};
    		int[] positions = SearchInRandomNumbers.searchAll(numbers, 42);
    		assertEquals(2, positions.length);
    		assertEquals(0, positions[0]);
    		assertEquals(2, positions[1]);
    	}
    	
    	@Test
    	public void searchAll_searchElementContainedTwice() throws Exception {
    		int[] numbers = new int[] {1, 2, 42, 3, 4, 42, 5, 6};
    		int[] positions = SearchInRandomNumbers.searchAll(numbers, 42);
    		assertEquals(2, positions.length);
    		assertEquals(2, positions[0]);
    		assertEquals(5, positions[1]);
    	}
    	
    	@Test
    	public void searchAll_searchElementNotContained() throws Exception {
    		int[] numbers = new int[] {1, 2, 3, 4, 5};
    		assertEquals(0, SearchInRandomNumbers.searchAll(numbers, 43).length);
    	}
    	
    	
    	
    	
    	
    	/*
    	 * searchLast
    	 */
    	
    	@Test(expected=PRException.class)
    	public void searchLast_emptyArray() throws Exception {
    		int[] numbers = new int[0];
    		SearchInRandomNumbers.searchLast(numbers, 43);
    	}
    	
    	@Test
    	public void searchLast_oneElementArrayWithSearchElement() throws Exception {
    		int[] numbers = new int[] {42};
    		assertEquals(0, SearchInRandomNumbers.searchLast(numbers, 42));
    	}
    	
    	@Test(expected=PRException.class)
    	public void searchLast_oneElementArrayWithoutSearchElement() throws Exception {
    		int[] numbers = new int[] {42};
    		SearchInRandomNumbers.searchLast(numbers, 43);
    	}
    	
    	@Test
    	public void searchLast_searchElementAtTheBeginning() throws Exception {
    		int[] numbers = new int[] {42, 1, 2};
    		assertEquals(0, SearchInRandomNumbers.searchLast(numbers, 42));
    	}
    	
    	@Test
    	public void searchLast_searchElementInTheMiddle() throws Exception {
    		int[] numbers = new int[] {1, 2, 42, 3, 4};
    		assertEquals(2, SearchInRandomNumbers.searchLast(numbers, 42));
    	}
    	
    	@Test
    	public void searchLast_searchElementAtTheEnd() throws Exception {
    		int[] numbers = new int[] {1, 2, 42};
    		assertEquals(2, SearchInRandomNumbers.searchLast(numbers, 42));
    	}
    	
    	@Test
    	public void searchLast_searchElementContainedTwice() throws Exception {
    		int[] numbers = new int[] {1, 2, 42, 3, 4, 42, 5, 6};
    		assertEquals(5, SearchInRandomNumbers.searchLast(numbers, 42));
    	}
    	
    	@Test(expected=PRException.class)
    	public void searchLast_searchElementNotContained() throws Exception {
    		int[] numbers = new int[] {1, 2, 3, 4, 5};
    		SearchInRandomNumbers.searchLast(numbers, 43);
    	}
    	
    }
