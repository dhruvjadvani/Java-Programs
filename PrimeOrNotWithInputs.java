package com.dhruv.javaprograms.primeornot;

import java.util.Scanner;

public class PrimeOrNotWithInputs {

	public static void main(String[] args) {
     
        Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the test number and give numbers: ");
		int t = scn.nextInt();
		
		for(int test = 0; test < t; test++) {
			int n = scn.nextInt();
			int count = 0;
			 
			for(int div = 2; div * div <= n; div++) {
				if (n % div == 0) {
					count++;
					break;
				}
			}
		if(count == 0) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not A Prime Number");
		}
			
		
		}
	}

}
