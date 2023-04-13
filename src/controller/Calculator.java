package controller;

public class Calculator {
	
	public int incrementNumber;
	
	public int sum(int x, int y) {
		
		return x + y;
		
	}
	
	public float division(int numerator, int divisor) {
		
		return numerator / divisor;
		
	}
	
	public void message() {
		System.out.println();
	}
	
	public void increment() {
		incrementNumber++;
	}
}
