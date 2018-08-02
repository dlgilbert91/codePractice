package Week1TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Week1.EvenOrOdd;

class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals(eoo.evenOrOdd(6), "Even");
        assertEquals(eoo.evenOrOdd(7), "Odd");       
    }

}
