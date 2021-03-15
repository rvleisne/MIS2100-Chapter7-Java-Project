package Leisner.Raquel.Chapter7.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath simpleMath1 = new SimpleMath();
		assertEquals(0, simpleMath1.divide(0, 7), 0.0001);

	}
	
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath simpleMath2 = new SimpleMath();
		assertEquals(0.25, simpleMath2.divide(1, 4), 0.0001);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath simpleMath3 = new SimpleMath();
		simpleMath3.divide(6, 0);
	}

}
