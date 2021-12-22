package com.dhruv.javaprograms.largestofthreenum;

import java.util.Scanner;

public class LargestOfThreeLogicTwo {

	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = scn.nextInt();
		
		System.out.println("Enter second number: ");
		int b = scn.nextInt();
		
		System.out.println("Enter third number: ");
		int c = scn.nextInt();
		
		int largestOne = a > b ? a : b;  // largest of a & b
		int largestTwo = c > largestOne ? c : largestOne; // largest of c & largestOne
		
		System.out.println(largestTwo + " is largest Number");
	}

}
