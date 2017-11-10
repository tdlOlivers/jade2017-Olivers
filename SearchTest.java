import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {
	
	@Test
	public void testCase1() {
		int[] a = {1, 3, 5, 8, 19};
		int x = 19;
		assertEquals(Search.find(x, a), 4);
	}
	
	@Test
	public void testCase2() {
		int[] a = {1, 3, 4, 5, 6, 8, 10, 12 ,13, 15, 19};
		int x = 19;
		assertEquals(Search.find(x, a), 10);
	}
	
	@Test
	public void testCase3() {
		int[] a = {};
		int x = 1;
		assertEquals(Search.find(x, a), -1);
	}
}
