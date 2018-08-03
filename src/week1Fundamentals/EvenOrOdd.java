package week1Fundamentals;

/* - - - - - PROBLEM - - - - -
 * Create a function that takes an integer as an argument and returns "Even" for even 
 * numbers or "Odd" for odd numbers.
 */
public class EvenOrOdd {

	public static String evenOrOdd(int number) {
		if ((number/2.0) % 1 == 0) {
			return "Even";
		} else {return "Odd";}
	}
}
