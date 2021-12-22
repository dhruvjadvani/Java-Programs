package com.dhruv.javaprograms.reverseanum;

import java.util.Scanner;

public class ReverseANumLogicTwo {

	public static void main(String[] args) {
    
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int num = scn.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("Reverse Number is:" + rev);
		
	}

}
