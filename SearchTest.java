import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {
	
	@Test
	public void testCase1() {
		int[] a = {1, 3, 5, 8, 19};
		int x = 19;
		assertEquals(Search.find(x, a), 4);
	}

}
