package Week1TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import week1Challenges.SumSquaredDivisors;

class SumSquaredDivisorsTest {
	@Test
	public void test1() {
		assertEquals("[[1, 1], [42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(1, 250));
	}
	@Test
	public void test2() {
		assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250));
	}
	@Test
	public void test3() {
		assertEquals("[[287, 84100]]", SumSquaredDivisors.listSquared(250, 500));
	}
}
