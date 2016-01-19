package net.euler.project7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeListTest {

	@Test
	public void sixPrimes() throws Exception {
		PrimeList list = new PrimeList(6);
		assertEquals("6th prime: ", 13, list.getNthPrime(6));
	}

	@Test
	public void tenThousandOnePrimes() throws Exception {
		PrimeList list = new PrimeList(10001);
		assertEquals("10001th prime: ", 104743, list.getNthPrime(10001));
	}
}
