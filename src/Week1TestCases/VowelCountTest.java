package Week1TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import week1Fundamentals.VowelCount;

class VowelCountTest {
    @Test
    public void testCase1() {
      assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
    }

}
