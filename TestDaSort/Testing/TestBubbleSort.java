import static org.junit.Assert.*;

import org.junit.Test;

public class TestBubbleSort {

	@Test
	public void test() {
		int[] myArray = {1, 5, 3, 6, 2, 1, 7};
		int[] sortedArray = {1,1,2,3,5,6,7};
		assertArrayEquals(sortedArray,BubbleSort.sort(myArray));
		
	}

}
