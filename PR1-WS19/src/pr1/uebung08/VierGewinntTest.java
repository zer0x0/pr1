    package pr1.uebung08;

    import static org.junit.Assert.*;

    import org.junit.Test;

    public class VierGewinntTest {

    	@Test
    	public void test1() {
            Spielfeld spielfeld = new Spielfeld();
            Spieler spieler1 = new Spieler('R');
            Spieler spieler2 = new Spieler('G');

            spielfeld.wirfSteinInFach(1, spieler1);
            spielfeld.wirfSteinInFach(1, spieler1);
            spielfeld.wirfSteinInFach(1, spieler1);
            spielfeld.wirfSteinInFach(1, spieler1);
    		
    		assertTrue (spielfeld.winSituation());
    	}
    	
    	   @Test
    	    public void test2() {
    	        Spielfeld spielfeld = new Spielfeld();
    	        Spieler spieler1 = new Spieler('R');
    	        Spieler spieler2 = new Spieler('G');

    	        spielfeld.wirfSteinInFach(1, spieler1);
    	        spielfeld.wirfSteinInFach(1, spieler1);
    	        spielfeld.wirfSteinInFach(1, spieler1);
                spielfeld.wirfSteinInFach(2, spieler2);
                spielfeld.wirfSteinInFach(2, spieler2);
                spielfeld.wirfSteinInFach(2, spieler2);
                spielfeld.wirfSteinInFach(3, spieler1);
                spielfeld.wirfSteinInFach(4, spieler1);
                spielfeld.wirfSteinInFach(5, spieler2);
                spielfeld.wirfSteinInFach(3, spieler2);
                spielfeld.wirfSteinInFach(4, spieler2);
                spielfeld.wirfSteinInFach(5, spieler1);
                spielfeld.wirfSteinInFach(3, spieler2);
                spielfeld.wirfSteinInFach(5, spieler2);
                spielfeld.wirfSteinInFach(4, spieler2);

    	        
    	        assertTrue (spielfeld.winSituation());
    	    }
    	
    	@Test
        public void test3() {
            Spielfeld spielfeld = new Spielfeld();
            Spieler spieler1 = new Spieler('R');
            Spieler spieler2 = new Spieler('G');

            spielfeld.wirfSteinInFach(1, spieler1);
            spielfeld.wirfSteinInFach(1, spieler1);
            spielfeld.wirfSteinInFach(1, spieler1);
            spielfeld.wirfSteinInFach(2, spieler2);
            spielfeld.wirfSteinInFach(2, spieler2);
            spielfeld.wirfSteinInFach(2, spieler2);
            spielfeld.wirfSteinInFach(3, spieler1);
            spielfeld.wirfSteinInFach(4, spieler1);
            spielfeld.wirfSteinInFach(5, spieler2);
            spielfeld.wirfSteinInFach(3, spieler2);
            spielfeld.wirfSteinInFach(4, spieler2);
            spielfeld.wirfSteinInFach(5, spieler1);
            spielfeld.wirfSteinInFach(3, spieler2);
            spielfeld.wirfSteinInFach(5, spieler2);
            spielfeld.wirfSteinInFach(4, spieler1);
            spielfeld.wirfSteinInFach(2, spieler2);

            
            assertTrue (spielfeld.winSituation());
    	}
    	
    	   @Test
    	    public void test4() {
    	       
    //	       { ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, 
    //         { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
    //         { ' ', 'G', ' ', ' ', ' ', ' ', ' ' },
    //         { 'R', 'R', 'G', ' ', 'G', ' ', ' ' },
    //         { 'R', 'G', 'G', 'G', 'R', ' ', ' ' },
    //         { 'R', 'G', 'R', 'R', 'G', ' ', ' ' };
    //
    	        Spielfeld spielfeld = new Spielfeld();
    	        Spieler spieler1 = new Spieler('R');
    	        Spieler spieler2 = new Spieler('G');

    	        spielfeld.wirfSteinInFach(1, spieler1);
    	        spielfeld.wirfSteinInFach(1, spieler1);
    	        spielfeld.wirfSteinInFach(1, spieler1);
    	        spielfeld.wirfSteinInFach(2, spieler2);
    	        spielfeld.wirfSteinInFach(2, spieler2);
    	        spielfeld.wirfSteinInFach(2, spieler1);
    	        spielfeld.wirfSteinInFach(3, spieler1);
    	        spielfeld.wirfSteinInFach(4, spieler1);
    	        spielfeld.wirfSteinInFach(5, spieler2);
    	        spielfeld.wirfSteinInFach(3, spieler2);
    	        spielfeld.wirfSteinInFach(4, spieler2);
    	        spielfeld.wirfSteinInFach(5, spieler1);
    	        spielfeld.wirfSteinInFach(3, spieler2);
    	        spielfeld.wirfSteinInFach(5, spieler2);
    	        spielfeld.wirfSteinInFach(4, spieler1);
    	        spielfeld.wirfSteinInFach(2, spieler2);

    	        
    	        assertTrue (spielfeld.winSituation());
    	    }


    	@Test
        public void test5() {
    //		{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, 
    //      { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
    //      { ' ', ' ', ' ', ' ', ' ', ' ', 'G' },
    //		{ 'R', 'G', 'G', ' ', 'G', 'R', 'G' },
    //		{ 'R', 'G', 'G', 'G', 'R', 'G', 'R' },
    //		{ 'R', 'G', 'R', 'R', 'G', 'R', 'G' };
    	   
           Spielfeld spielfeld = new Spielfeld();
           Spieler spieler1 = new Spieler('R');
           Spieler spieler2 = new Spieler('G');

           spielfeld.wirfSteinInFach(1, spieler1);
           spielfeld.wirfSteinInFach(1, spieler1);
           spielfeld.wirfSteinInFach(1, spieler1);
           
           spielfeld.wirfSteinInFach(2, spieler2);
           spielfeld.wirfSteinInFach(2, spieler2);
           spielfeld.wirfSteinInFach(2, spieler2);
           
           spielfeld.wirfSteinInFach(3, spieler1);
           spielfeld.wirfSteinInFach(3, spieler2);
           spielfeld.wirfSteinInFach(3, spieler2);
           
           spielfeld.wirfSteinInFach(4, spieler1);
           spielfeld.wirfSteinInFach(4, spieler2);
          
           spielfeld.wirfSteinInFach(5, spieler2);
           spielfeld.wirfSteinInFach(5, spieler1);
           spielfeld.wirfSteinInFach(5, spieler2);
      
           spielfeld.wirfSteinInFach(6, spieler1);
           spielfeld.wirfSteinInFach(6, spieler2);
           spielfeld.wirfSteinInFach(6, spieler1);

           spielfeld.wirfSteinInFach(7, spieler2);
           spielfeld.wirfSteinInFach(7, spieler1);
           spielfeld.wirfSteinInFach(7, spieler2);
           spielfeld.wirfSteinInFach(7, spieler2);
           
           assertFalse (spielfeld.winSituation());
    	}

        @Test
        public void test6() {
    //      { ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, 
    //      { ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
    //      { ' ', ' ', ' ', ' ', ' ', ' ', 'R' },
    //      { 'R', 'G', 'G', ' ', 'G', 'R', 'G' },
    //      { 'R', 'G', 'G', 'G', 'R', 'G', 'R' },
    //      { 'R', 'G', 'R', 'R', 'G', 'R', 'G' };
           
           Spielfeld spielfeld = new Spielfeld();
           Spieler spieler1 = new Spieler('R');
           Spieler spieler2 = new Spieler('G');

           spielfeld.wirfSteinInFach(1, spieler1);
           spielfeld.wirfSteinInFach(1, spieler1);
           spielfeld.wirfSteinInFach(1, spieler1);
           
           spielfeld.wirfSteinInFach(2, spieler2);
           spielfeld.wirfSteinInFach(2, spieler2);
           spielfeld.wirfSteinInFach(2, spieler2);
           
           spielfeld.wirfSteinInFach(3, spieler1);
           spielfeld.wirfSteinInFach(3, spieler2);
           spielfeld.wirfSteinInFach(3, spieler2);
           
           spielfeld.wirfSteinInFach(4, spieler1);
           spielfeld.wirfSteinInFach(4, spieler2);

           spielfeld.wirfSteinInFach(5, spieler2);
           spielfeld.wirfSteinInFach(5, spieler1);
           spielfeld.wirfSteinInFach(5, spieler2);
           
           spielfeld.wirfSteinInFach(6, spieler1);
           spielfeld.wirfSteinInFach(6, spieler2);
           spielfeld.wirfSteinInFach(6, spieler1);

           spielfeld.wirfSteinInFach(7, spieler2);
           spielfeld.wirfSteinInFach(7, spieler1);
           spielfeld.wirfSteinInFach(7, spieler2);
           spielfeld.wirfSteinInFach(7, spieler1);
           
           assertTrue (spielfeld.winSituation());
        }
        @Test
        public void test7() {
    //      { 'G', 'G', 'G', 'R', 'G', 'G', 'G' }, 
    //      { 'R', 'R', 'R', 'G', 'R', 'R', 'R' },
    //      { 'G', 'G', 'G', 'R', 'G', 'G', 'G' },
    //      { 'R', 'R', 'R', 'G', 'R', 'R', 'R' },
    //      { 'G', 'G', 'G', 'R', 'G', 'G', 'G' },
    //      { 'R', 'R', 'R', 'G', 'R', 'R', 'R' };
           
           Spielfeld spielfeld = new Spielfeld();
           Spieler spieler1 = new Spieler('R');
           Spieler spieler2 = new Spieler('G');

           spielfeld.wirfSteinInFach(1, spieler1);
           spielfeld.wirfSteinInFach(1, spieler2);
           spielfeld.wirfSteinInFach(1, spieler1);
           spielfeld.wirfSteinInFach(1, spieler2);
           spielfeld.wirfSteinInFach(1, spieler1);
           spielfeld.wirfSteinInFach(1, spieler2);

           spielfeld.wirfSteinInFach(2, spieler1);
           spielfeld.wirfSteinInFach(2, spieler2);
           spielfeld.wirfSteinInFach(2, spieler1);      
           spielfeld.wirfSteinInFach(2, spieler2);
           spielfeld.wirfSteinInFach(2, spieler1);
           spielfeld.wirfSteinInFach(2, spieler2);
           
           spielfeld.wirfSteinInFach(3, spieler1);
           spielfeld.wirfSteinInFach(3, spieler2);
           spielfeld.wirfSteinInFach(3, spieler1);
           spielfeld.wirfSteinInFach(3, spieler2);
           spielfeld.wirfSteinInFach(3, spieler1);
           spielfeld.wirfSteinInFach(3, spieler2);
           
           spielfeld.wirfSteinInFach(4, spieler2);
           spielfeld.wirfSteinInFach(4, spieler1);
           spielfeld.wirfSteinInFach(4, spieler2);
           spielfeld.wirfSteinInFach(4, spieler1);
           spielfeld.wirfSteinInFach(4, spieler2);
           spielfeld.wirfSteinInFach(4, spieler1);

           spielfeld.wirfSteinInFach(5, spieler1);
           spielfeld.wirfSteinInFach(5, spieler2);
           spielfeld.wirfSteinInFach(5, spieler1);
           spielfeld.wirfSteinInFach(5, spieler2);
           spielfeld.wirfSteinInFach(5, spieler1);
           spielfeld.wirfSteinInFach(5, spieler2);
           
           spielfeld.wirfSteinInFach(6, spieler1);
           spielfeld.wirfSteinInFach(6, spieler2);
           spielfeld.wirfSteinInFach(6, spieler1);
           spielfeld.wirfSteinInFach(6, spieler2);
           spielfeld.wirfSteinInFach(6, spieler1);
           spielfeld.wirfSteinInFach(6, spieler2);

           spielfeld.wirfSteinInFach(7, spieler1);
           spielfeld.wirfSteinInFach(7, spieler2);
           spielfeld.wirfSteinInFach(7, spieler1);
           spielfeld.wirfSteinInFach(7, spieler2);
           spielfeld.wirfSteinInFach(7, spieler1);
           spielfeld.wirfSteinInFach(7, spieler2);
          
           assertTrue (spielfeld.checkRemis());
        }
    }
