package Week1TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Week1.TillWithNoMoney;

class TillWithNoMoneyTest {
    @Test
    public void test1() {
      assertEquals("YES", TillWithNoMoney.Tickets(new int[] {25, 25, 50}));
    }
   @Test
   public void test2() {
      assertEquals("NO", TillWithNoMoney.Tickets(new int []{25, 100}));
    }
   
   @Test
   public void test3() {
	   assertEquals("YES", TillWithNoMoney.Tickets(new int[] {25, 25, 25, 25, 50, 100, 50}));
   }
   
}
