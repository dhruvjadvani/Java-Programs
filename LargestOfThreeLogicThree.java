package com.dhruv.javaprograms.largestofthreenum;

import java.util.Scanner;

public class LargestOfThreeLogicThree {

	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = scn.nextInt();
		
		System.out.println("Enter second number: ");
		int b = scn.nextInt();
		
		System.out.println("Enter third number: ");
		int c = scn.nextInt();
		
		int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);
		System.out.println(largest + " is largest Number");
	}

}
