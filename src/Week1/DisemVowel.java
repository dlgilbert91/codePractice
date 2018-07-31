package Week1;
/* - - - - - PROBLEM - - - - -
 * Remove all vowels from a given string.
 */
public class DisemVowel {
	    public static String disemvowel(String str) {
	    	//look at each character in the string
	    	//if the character = vowel, remove it
	    	//return the string	    	
	    	char[] charArray = str.toCharArray();
	    	str = "";
	    	for (char c : charArray) {
	    		if (!(Character.toUpperCase(c) == 'A' || Character.toUpperCase(c) == 'E' || Character.toUpperCase(c) == 'I' || Character.toUpperCase(c) == 'O' || 
	    				Character.toUpperCase(c) == 'U')) {
	    			str += c;
	    		}
	    	}
			return str;
	    }
	
	
	
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(disemvowel(str));

	}
	
	/* - - - - - ISSUES - - - - -
	 * Multiple ors in if statement eg;
	 * if ((Character.toUpperCase(c) == 'A' || Character.toUpperCase(c) == 'E') written like this would not work. Needed ! at start
	 */
}
