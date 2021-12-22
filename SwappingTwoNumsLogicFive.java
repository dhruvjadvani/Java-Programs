package com.dhruv.javaprograms.swappingtwonums;

public class SwappingTwoNumsLogicFive {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping values are " + a + " " + b);
		
		b = a + b - (a = b);
		
		System.out.println("After swapping values are " + a + " " + b);
		
	}

}
