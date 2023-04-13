package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {
	
	Calculator calc;
	
	
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	

	@Test
	public void SumTest() {
		
		assertEquals("Deveria somar os inteiros:", 20, calc.sum(10, 10));
	}
	
	@Test
	public void SumNegativeNumbersTest() {
		assertEquals(10, 10);
	}
	
	@Test
	public void DivisionTest() {
		
		assertEquals("Deveria dividir números inteiros: ", calc.division(20, 10), 2);
	}
	
	// 3.14, 0.01 -> specifies the precision

	@Test
	public void DivisionPITest() {
		
		assertEquals("Deveria dividir números inteiros: ", Math.PI, 3.14, 0.01);
	}
	
	@Test (expected = ArithmeticException.class)
	public void DivisionByZeroTest() throws ArithmeticException {
		
		assertEquals("Deveria dividir números inteiros: ", calc.division(20, 0), 2);
	}
	
	@Test
	public void IncrementTest() {
		calc.incrementNumber = 20;
		calc.increment();
		assertEquals(calc.incrementNumber, 20 + 1);
	}

}
