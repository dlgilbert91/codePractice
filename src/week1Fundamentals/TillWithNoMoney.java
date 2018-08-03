package week1Fundamentals;

/* - - - - - PROBLEM - - - - -
 * The new "Avengers" movie has just been released! There are a lot of people at the 
 * cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 
 * dollars bill. An "Avengers" ticket costs 25 dollars. Vasya is currently working as 
 * a clerk. He wants to sell a ticket to every single person in this line. Can Vasya 
 * sell a ticket to each person and give the change if he initially has no money and 
 * sells the tickets strictly in the order people follow in the line? Return YES, if 
 * Vasya can sell a ticket to each person and give the change with the bills he 
 * has at hand at that moment. Otherwise return NO.
 */
public class TillWithNoMoney {
	public static String Tickets(int[] peopleInLine) {
		int[] notes = new int[] {0, 0, 0}; //array representing 25, 50, 100 bills
		for (int i = 0; i < peopleInLine.length; i++) {
			switch (peopleInLine[i]) {
			case 25: 
				notes[0]++;
				break;
			case 50:
				notes[0]--;
				notes[1]++;
				break;
			case 100:
				notes[2]++;
				if (notes[1] > 0) {
					notes[1]--;
					notes[0]--;
				} else {
					notes[0] -= 3;
				}
				break;
			}
			if (notes[0] < 0) {
				return "NO";
			}
		}
		return "YES";
	}
}
/* - - - - - Issues - - - - -
 * Implemented a running count of cash on hand rather than which bills he has in hand - fixed.
 * 		int moneyInTill = 0;
		final int TICKET_PRICE = 25;
		
		for (int i = 0; i < peopleInLine.length; i++) {
			if (peopleInLine[i] == TICKET_PRICE) {
				moneyInTill += peopleInLine[i];
			}
			else if (peopleInLine[i] > TICKET_PRICE) {
				moneyInTill -= peopleInLine[i] - TICKET_PRICE;
				if (moneyInTill < 0) {
					return "NO";
				}
			}
		}
		return "YES";
	}
 */


