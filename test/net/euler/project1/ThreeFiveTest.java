package net.euler.project1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThreeFiveTest {

	@Test
	public void ThreeFiveTo10Test() {
		assertEquals( "sum of multiple below 10", 23, ThreeFiveList.getSumBelow(10));
	}
	
	@Test
	public void ThreeFiveTo1000Test() {
		assertEquals( "sum of multiple below 1000", 233168, ThreeFiveList.getSumBelow(1000));
	}
}
