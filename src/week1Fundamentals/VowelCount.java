package week1Fundamentals;

/* - - - - - PROBLEM - - - - -
 * Return the number (count) of vowels in the given string. 
 */
public class VowelCount {
	public static int getCount(String str) {
	    int vowelsCount = 0;
	    char[] characters = str.toCharArray();
	    for (int i = 0; i < str.length(); i++) {
	    	switch (Character.toUpperCase(characters[i])) {
	    		case 'A': vowelsCount++;
	    		break;
	    		case 'E': vowelsCount++;
	    		break;
	    		case 'I': vowelsCount++;
	    		break;
	    		case 'O': vowelsCount++;
	    		break;
	    		case 'U': vowelsCount++;
	    		break;
	    	}
	    }
	    return vowelsCount;
	}
}
