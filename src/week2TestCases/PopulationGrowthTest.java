package week2TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import week2Fundamentals.PopulationGrowth;

class PopulationGrowthTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");    
        testing(PopulationGrowth.nbYear(1500, 5, 100, 5000),15);
        testing(PopulationGrowth.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(PopulationGrowth.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }

}
