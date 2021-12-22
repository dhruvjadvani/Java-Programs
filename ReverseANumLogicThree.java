package com.dhruv.javaprograms.reverseanum;

import java.util.Scanner;

public class ReverseANumLogicThree {

	public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		
		int num = scn.nextInt();
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Reverse Number is:" + rev);
		
	}

}
