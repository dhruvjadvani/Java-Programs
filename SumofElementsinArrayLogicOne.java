package com.dhruv.javaprograms.sumofelementsinarray;

public class SumofElementsinArrayLogicOne {

	public static void main(String[] args) {
		
		int a[] = {5,2,7,9,6};  // n-5
		int sum = 0;
		
		for(int value:a) {
			sum = sum + value;
		}
		System.out.println("Sum of Array elements: " + sum);
	}

}
