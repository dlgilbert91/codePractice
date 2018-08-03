package week1Fundamentals;
/* - - - - - PROBLEM - - - - -
 * Given number array return it in reverse order.
 */
public class ReverseNumberArray {
	public static int[] digitize(long n) {
		String number = String.valueOf(n);
		int[] numberForReturn = new int[number.length()];
		int sizeOf = number.length() - 1;
		
		for (int i = 0; i < number.length(); i++) {
			numberForReturn[i] = number.charAt(sizeOf) - '0';
			System.out.println(number.charAt(sizeOf) - '0');
			sizeOf--;
		}
		System.out.println(number);
		return numberForReturn; 
	}
	
	public static void main(String[] args) {
		digitize(12345);
	}
	
	/* - - - - - LEARNT - - - - -
	 * A new way to convert char to int using '0'. only works if the character is a digit so wouldn't be all that useful in the real world.
	 */
}


