package week1Fundamentals;

/* - - - - - PROBLEM - - - - -
 * Description:

We want to generate a function that computes the series starting from 0 and ending 
until the given number following the sequence:

0 1 3 6 10 15 21 28 36 45 55 ....

which is created by

0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6, 0+1+2+3+4+5+6+7 etc..

Input:

LastNumber

Output:

series and result
 */
public class SumOfNumbers {

	public static String showSequence(int value) {
		int sum = 0;
		String stringOfNumbers = "";
		if (value < 0) {
			return value + "<0";
		} 
		else if (value == 0) {
			return "0=0";
		}
		else {
			for (int i = 0; i < value; i++) {
				sum += i;
				stringOfNumbers += i + "+";
			}
			sum += value;
			return stringOfNumbers + value + " = " + sum;
		}
	}

}
