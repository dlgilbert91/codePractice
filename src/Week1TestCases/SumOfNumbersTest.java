package Week1TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import week1Fundamentals.SumOfNumbers;

class SumOfNumbersTest {
    @Test
    public void testBasic() { 
      assertEquals("0+1+2+3+4+5+6 = 21",SumOfNumbers.showSequence(6));
    }
    @Test
    public void testNegative() { 
      assertEquals("-15<0",SumOfNumbers.showSequence(-15));
    }

}
