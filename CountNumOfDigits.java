package com.dhruv.javaprograms.countnumofdigits;

public class CountNumOfDigits {

	public static void main(String[] args) {
		
		int num = 123456;
		int count = 0;
		while(num > 0) {
			num = num / 10;
			count++;
		}
		
		System.out.println("Num of Digits: " + count);
	}

}
