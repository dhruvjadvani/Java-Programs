package com.dhruv.javaprograms.equalityoftwoarray;

import java.util.Arrays;

public class EqualityOfTwoArray {

	public static void main(String[] args) {
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		boolean status = Arrays.equals(a1, a2);
		
		if(status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

}
