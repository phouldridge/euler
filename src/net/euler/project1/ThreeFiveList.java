package net.euler.project1;

public class ThreeFiveList {

	public static int getSumBelow( int n) {
		int sum = 0;
		
		for( int x = 3; x < n; x++) {
			if( x % 3 == 0 || x % 5 == 0) {
				sum += x;
			}
		}
		
		return sum;
	}

}
