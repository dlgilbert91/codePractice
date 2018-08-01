package Week1;

/* - - - - - PROBLEM - - - - -
 * Calculate average of given array.
 */
public class CalculateAverage{
	  public static double find_average(int[] array){
		  double average = 0;
		  for (int i = 0; i < array.length; i++) {
			  average += array[i];
		  }
		  average /= array.length;
		  return average;
	  }
	}
