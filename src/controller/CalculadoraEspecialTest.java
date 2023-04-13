package controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraEspecialTest {

	CalculadoraEspecial calc;

	@Before
	public void setUp() throws Exception {
		calc = new CalculadoraEspecial();
	}

	// functionality 1
	@Test
	public void SearchValueTest() {
		int vector[] = {2, 3, 10, 50, 56, 90, 81, 12, 45, 65};
		int searchNumber = 56;
		int expectedIndex = 4; 
		
		assertEquals(calc.pesquisar(vector, searchNumber), expectedResult);
	}
	
	@Test
	public void OutOfVectorTest() {
		int vector[] = {2, 3, 10, 50, 56, 90, 81, 12, 45, 65};
		int searchNumber = 100;
		int expectedResult = -100; 
		
		assertEquals(calc.pesquisar(vector, searchNumber), expectedResult);
	}
	
	// functionality 2
	@Test
	public void SearchByIndexTest() {
		int vector[] = {2, 3, 10, 50, 56, 90, 81, 12, 45, 65};
		int searchIndex = 5;
		int expectedResult = 90;
		
		assertEquals(calc.pesquisarPorIndice(vector, searchIndex), expectedResult);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void NotFoundIndexTest() throws IndexOutOfBoundsException {
		int vector[] = {2, 3, 10, 50, 56, 90, 81, 12, 45, 65};
		int searchIndex = 50;
		int expectedResult = 90;
		
		assertEquals(calc.pesquisarPorIndice(vector, searchIndex), expectedResult);
	}
	
	// functionality 3
	@Test
	public void NumberOrderingTest() {
		int vector[] = {-10, 30, 50, -35, 90, -45};
		int expectedVector[] = {-45, -35, -10, 30, 50, 90}; 
		
		assertTrue(calc.separacao())
	}

	
	
	
	

}
