package com.dhruv.javaprograms.palindromestring;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
    
		Scanner scn = new Scanner(System.in);
		
	    System.out.println("Enter a String:");
	    
	    String str = scn.next();
	    String orgStr = str;
	    String rev = "" ;
	    
	    int len = str.length();
	    
	    for(int i = len - 1; i >= 0; i--) {
	    	rev = rev + str.charAt(i);
	    }
	    
	    if(orgStr.equals(rev)) {
	    	System.out.println(orgStr + " is a palindrome string");
	}
	    else {
	    	System.out.println(orgStr + " is not a palindrome string");
	    }
}	
}
