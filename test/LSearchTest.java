import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LSearchTest {

	LSearch ls;
	/*
	 * Part 1: complete unit tests
	 */
	
	@Before
	public void setup(){
		ls = new LSearch();
		// doesn't have to be ordered!
		ls.addAtHead(new Entry("Andrew",111));
		ls.addAtHead(new Entry("Ewen",321));
		ls.addAtHead(new Entry("Peter",123));
		ls.addAtHead(new Entry("Roger",222));
		
	}
	
	@Test
	public void testLinearSearchOK() {
		//TESTING IN LINEAR SEARCH FOR A PERSON PRESENT IN THE COLLECTION
		assertEquals(111,ls.linearSearch("Andrew"));
		assertEquals(321,ls.linearSearch("Ewen"));
		assertEquals(123,ls.linearSearch("Peter"));
		assertEquals(222,ls.linearSearch("Roger"));
	}

	@Test
	public void testLinearSearchFail() {
		//TESTING IN LINEAR SEARCH FOR A PERSON NOT PRESENT IN THE COLLECTION
		assertEquals(-1,ls.linearSearch("Parthiban"));
	}

}
