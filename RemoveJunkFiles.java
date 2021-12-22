package com.dhruv.javaprograms.removejunkfiles;

public class RemoveJunkFiles {

	public static void main(String[] args) {
		
		String s = "?><<>@!#$% latin st 0123";
		s = s.replaceAll("[^a-z A-Z 0-9]", " ");
		System.out.println(s);
	}

}
