package week1Fundamentals;

/* - - - - - PROBLEM - - - - -
 * None given - TDD Test - Refer to AccumulTest.
 */
public class Accumul {
    public static String accum(String s) {
    	int count = 0;
    	char[] charArray = new char[s.length()];
    	charArray = s.toCharArray();
    	s = "";
    	s += Character.toUpperCase(charArray[0]);
    	while (count < charArray.length) {
    		for (int i = 0; i < count; i++) {
    			if (i == 0) {
    				s += Character.toUpperCase(charArray[count]);
    			}
    			s += Character.toLowerCase(charArray[count]);
    		}
    		count++;
    		if (count < charArray.length) {
    			s += "-";
    		}
    	}
    	return s;
    }
}
