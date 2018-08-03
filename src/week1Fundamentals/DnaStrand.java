package week1Fundamentals;

/* - - - - - PROBLEM - - - - -
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); 
 * you need to get the other complementary side.
 */
public class DnaStrand {
	  public static String makeComplement(String dna) {
		  char[] dnaChars = new char[dna.length()];
		  dnaChars = dna.toCharArray();
		  String dnaComplements = "";
		  for (int i = 0; i < dna.length(); i++) {
			  switch (Character.toUpperCase(dnaChars[i])) {
				  case 'A': dnaComplements += "T";
				  break;
				  case 'T': dnaComplements += "A";
				  break;
				  case 'C': dnaComplements += "G";
				  break;
				  case 'G': dnaComplements += "C";
				  break;  
			  }
		  }
		  return dnaComplements;
	  }
}
