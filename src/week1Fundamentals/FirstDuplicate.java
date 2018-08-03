package week1Fundamentals;

public class FirstDuplicate {

	public static void main(String[] args) {
		int a[] = {2, 1, 3, 5, 3, 2};
		
		System.out.println(findFirstDuplicate(a));
	}
	
	private static int findFirstDuplicate(int[] a) {
	    //iterate through the array
	    //find a duplicate
	    //if duplicate found hold its first entry
	    //return lowest entry
		int store = -1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (store > 0) {
						if (j < store) {
							store = j;
						}
					} else {
						store = j;
					}
				}
			}
		}
		if (store > 0) {
			return a[store];
		} else {
			return -1;
		}
	}
}
