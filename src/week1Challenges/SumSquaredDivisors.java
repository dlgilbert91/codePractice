package week1Challenges;

import java.util.ArrayList;
import java.util.HashMap;

/* - - - - - PROBLEM - - - - -
 * Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are: 
 * 1, 4, 9, 36, 49, 196, 441, 1764. The sum of the squared divisors is 2500 which is 
 * 50 * 50, a square!
 * Given two integers m, n (1 <= m <= n) we want to find all integers between m 
 * and n whose sum of squared divisors is itself a square. 42 is such a number.
 */
public class SumSquaredDivisors {
	public static String listSquared(long m, long n) {
		//for each number between m and n find their divisors
		//sum their divisors
		//check if the sum is squared
		ArrayList<Long> divisors = new ArrayList<>();
		HashMap<Long, Integer> squaredDivisors = new HashMap<>();
		int sum = 0;
		String divisorsString = "";
		
		for (long i = m; i < n; i++) {
			if (n % i == 0) {
				divisors.add(i);
			}
		}
		for (long d : divisors) {
			sum += Math.pow(d, 2);
		}
		if (checkIfSquared(sum)) {
			squaredDivisors.put(m, sum);
		}
		return squaredDivisors.toString();
	}

	public static boolean checkIfSquared(int sum) {
		int squareRoot = (int) Math.sqrt(sum);
		if (Math.pow(squareRoot, 2) == sum) {
			return true;
		} else { return false; }	
	}
}