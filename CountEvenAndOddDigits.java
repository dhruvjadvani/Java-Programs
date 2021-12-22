package com.dhruv.javaprograms.countevenandodd;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		
		int num = 12345;
		int evenNumCount = 0;
		int oddNumCount = 0;
		
		while(num > 0) {
			int rem = num % 10;
			
			if(rem % 2 == 0) {
				evenNumCount++;
			} else {
				oddNumCount++;
			}
			
			num = num / 10;
		}
		
		System.out.println("No of Even Numbers: " + evenNumCount);
		
		System.out.println("No of Odd Numbers: " + oddNumCount);
	}

}
