package com.dhruv.javaprograms.palindromenum;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
    
	Scanner scn = new Scanner(System.in);
	
    System.out.println("Enter a num:");
    
    int num = scn.nextInt();
    
    int orgNum = num;
    int rev = 0 ;
    
    while(num!=0) {
    	rev = rev * 10 + num % 10;
    	num = num / 10;
    }
    
    if(orgNum == rev) {
    	System.out.println(orgNum + " is a Palindrome Number ");
    }
    
    else {
    	System.out.println(orgNum + " is not a Palindrome Number ");
    }
	
	}

}
