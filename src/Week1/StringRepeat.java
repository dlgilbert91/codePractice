package Week1;

/* - - - - - PROBLEM - - - - -
 * Write a function called repeatStr which repeats the given string string exactly n times.
 */
public class StringRepeat {

	public static String repeatStr(int repeat, String string) {
		String stringRepeat = "";
		for (int i = 0; i < repeat; i++) {
			stringRepeat += string;
		}
		return stringRepeat;
	}
}
