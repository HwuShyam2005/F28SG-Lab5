import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ASearchTest {

	ASearch as;
	/*
	 * Part 1: complete unit tests
	 */
	@Before
	public void setup(){
		as = new ASearch();
		as.addEntry(new Entry("Andrew",111));
		as.addEntry(new Entry("Ewen",321));
		as.addEntry(new Entry("Peter",123));
		as.addEntry(new Entry("Roger",222));
		
	}
	
	@Test
	public void testLinearSearchOK() {
		//TESTING IN LINEAR SEARCH FOR A PERSON PRESENT IN THE COLLECTION
		assertEquals(111,as.linearSearch("Andrew"));
		assertEquals(321,as.linearSearch("Ewen"));
		assertEquals(123,as.linearSearch("Peter"));
		assertEquals(222,as.linearSearch("Roger"));
	}

	@Test
	public void testLinearSearchFail() {
		//TESTING IN LINEAR SEARCH FOR A PERSON NOT PRESENT IN THE COLLECTION
		assertEquals(-1,as.linearSearch("Parthiban"));
	}
	
	@Test
	public void testBinarySearchOK() {
		//TESTING IN BINARY SEARCH FOR A PERSON PRESENT IN THE COLLECTION
		assertEquals(111,as.binarySearch("Andrew"));
		assertEquals(321,as.binarySearch("Ewen"));
		assertEquals(123,as.binarySearch("Peter"));
		assertEquals(222,as.binarySearch("Roger"));
	}
	
	@Test
	public void testBinarySearchFail() {
		//TESTING IN BINARY SEARCH FOR A PERSON NOT PRESENT IN THE COLLECTION
		assertEquals(-1,as.binarySearch("Parthiban"));
	}

}
