package Week1TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Week1.NumberToString;

class NumberToStringTest {
	  @Test
	  public void tests() {
	    assertEquals("67", NumberToString.numberToString(67));
	    assertEquals("123", NumberToString.numberToString(123));
	    assertEquals("999", NumberToString.numberToString(999));
	  }

}
