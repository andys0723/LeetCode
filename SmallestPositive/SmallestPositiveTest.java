package SmallestPositive;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmallestPositiveTest {

	@Test
	public void test1() {
       int[] input = {1,3,6,10,11,15};
       assertEquals(Solution.findSmallestPositive(input),2);

	}

	@Test
	public void test2() {

       int[] input ={1,1,1,1};
       assertEquals(Solution.findSmallestPositive(input),5);

	}
	
	@Test
	public void test3() {

       int[] input = {1,1,3,4};
       assertEquals(Solution.findSmallestPositive(input),10);
	}
}
