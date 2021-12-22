package com.dhruv.javaprograms.factorialnum;

public class FactorialOfNumDecendingOrder {

	public static void main(String[] args) {
		
		int num = 10;
		long factorial = 1;
		
		for(int i=num; i >= 1; i--) {
			factorial = factorial * i;
		}
		
		System.out.println(" Factorial of a num is: " + factorial);
	}

}
