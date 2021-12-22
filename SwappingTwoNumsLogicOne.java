package com.dhruv.javaprograms.swappingtwonums;

public class SwappingTwoNumsLogicOne {

	public static void main(String[] args) {
		
	int a = 10;
	int b = 20;
	
	System.out.println("Before swapping values are " + a + " " + b);
	
	int temp = a;
    a = b;
    b = temp;
    
    System.out.println("After swapping values are " + a + " " + b);
	
	}

}
