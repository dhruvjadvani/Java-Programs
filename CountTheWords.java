package com.dhruv.javaprograms.countwordinstring;

import java.util.*;

public class CountTheWords {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner scn = new Scanner(System.in);
		
		String S = scn.nextLine();
		int count = 1;
		
		for(int i = 0; i < S.length() - 1; i++) {
			if((S.charAt(i)== ' ')&& (S.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		
		System.out.println("Num of words in a string: " + count);
	}

}
