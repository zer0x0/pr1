
    package pr1.uebung06;

    import static org.junit.Assert.*;

    import org.junit.Test;

    public class DividersArrayResult1stTest2 {

    	@Test
    	public void prime() {
    		int[] dividers = DividersArrayResult.calculateDividers(17);
    		assertEquals(500, dividers.length);
    		assertEquals(1, dividers[0]);
    		assertEquals(17, dividers[1]);
    	}

    	@Test
    	public void evenNumber() {
    		int[] dividers = DividersArrayResult.calculateDividers(6);
    		assertEquals(500, dividers.length);
    		assertEquals(1, dividers[0]);
    		assertEquals(2, dividers[1]);
    		assertEquals(3, dividers[2]);
    		assertEquals(6, dividers[3]);
    	}
    	
    }
