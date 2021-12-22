package com.dhruv.javaprograms.evenandoddnumsfromarray;

public class EvenAndOddNumsFromArrayLogicOne {

	public static void main(String[] args) {
		
		int a[] = {1,5,2,7,9,6};
		System.out.println(" Even numbers in array");
		
		for(int value : a) {
			if(value % 2 == 0) 
				System.out.println(value);	
		}
		System.out.println("----------------------------------------------------");
		System.out.println(" Odd numbers in array");
		
		for(int value : a) {
			if(value % 2 != 0) 
				System.out.println(value);	
		}
		
	}

}
