package com.dhruv.javaprograms.removewhitespaces;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = " JAVA     Programming    Tutorial";
		System.out.println("Before removing the white spaces : " + str);
		
		str = str.replaceAll("\\s", "");
		System.out.println("After removing the white spaces : " + str);
		
	}

}
