package net.euler.project2;

public class FibinocciSequence {

	public static int SumEvenValuesLessThan( int n) throws Exception {
		int one = 1;
		int two = 2;
		int sum = 2;
		int next = 0;
		
		if( n <= 2) { throw new Exception("Invalid input"); }
		
		while( true) {
			next = one + two;
			if( next > n) { 
				break; 
			}
			one = two;
			two = next;
			if( next % 2 == 0) {
				sum += next;
			}
		} 
		
		return sum;
	}
}
