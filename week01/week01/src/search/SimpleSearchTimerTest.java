package search;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import intArrays.Array;
import intArrays.SimpleRandomListing;

public class SimpleSearchTimerTest extends SimpleSearchTimer
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testTwentyFive()throws IndexingError {
		int size =25;
		int[] testNumbers;
		testNumbers=new SimpleRandomListing(size).getArray();
		SearchTimer search= new SimpleSearchTimer();
		assertEquals(21,search.findKthElement(testNumbers, 4));
	}
	
	public void testSize(int n,Array generator) {
		assertEquals(n,generator.getArray().length);
	}

}
