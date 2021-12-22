package com.dhruv.javaprograms.reverseeachwordinstring;

public class ReverseEachWordInStringLogicOne {

	public static void main(String[] args) {
		
		String str = " Welcome to Java";
		String[] words = str.split(" ");
		String reverseString = " ";
		
		
		for(String w:words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseString = reverseString + sb.toString() + " ";
		}
		
		
		System.out.println(reverseString);
	}

}
