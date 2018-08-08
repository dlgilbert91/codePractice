package week2Fundamentals;

/* - - - - - PROBLEM - - - - -
In your class, you have started lessons about arithmetic progression. Since you are 
also a programmer, you have decided to write a function that will return the first n 
elements of the sequence with the given common difference d and first element a. Note 
that the difference may be zero!

The result should be a string of numbers, separated by comma and space.
 */
public class ArithmeticProgression {
	public static String arithmeticSequenceElements(int first, int step, long total) {
		String progression = "";
		int count = 0;
		for (int i = first; count < total; i += step) {
			if (count == total - 1) {
				progression += i;
				count++;
			} else {
				progression += i + ", ";
				count++;
			}
		}
		return progression;
	}

}
