package net.euler.project2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenFibonacciSumTest {

	@Test
	public void fibinocciEvenSumLessThan100() throws Exception {
		assertEquals( "sum of even fibinocci values less than 100", 44, FibinocciSequence.SumEvenValuesLessThan( 100));
	}

	@Test
	public void fibinocciEvenSumLessThan4Million() throws Exception {
		assertEquals( "sum of even fibinocci values less than 4 million", 4613732, FibinocciSequence.SumEvenValuesLessThan( 4000000));
	}
}
