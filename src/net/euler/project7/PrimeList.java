package net.euler.project7;

import java.util.ArrayList;

public class PrimeList {
	ArrayList<Integer> primes = new ArrayList<Integer>();

	public PrimeList(int totalPrimes) {
		int n = 2;
		while( totalPrimes > 0) {
			if( isPrime( n)) {
				primes.add( n);
				totalPrimes--;
			}
			n++;
		}
	}

	/** Java method to check if an integer number is prime or not. * @return
	 * true if number is prime, else false
	 */ 
	private boolean isPrime(int number) {
		boolean result = true;
		for( Integer i: primes) {
			if (number % i == 0) { 
				result = false;
				break;
			} 
		}
		return result; 
	}
	
	public int getNthPrime( int n) { return primes.get(n-1); }
	public int getTotalPrimes() { return primes.size(); }
}
