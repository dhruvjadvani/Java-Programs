package com.dhruv.javaprograms.missingnuminarray;

public class MissingNumInArray {

	public static void main(String[] args) {
		int a[]= {1,2,4,5};
		
		int sumOne = 0;
		for(int i = 0; i < a.length; i++ ) {
			sumOne = sumOne + a[i];
		}
		
		System.out.println("Sum of elements in arrays: " + sumOne);
		
		int sumTwo = 0;
		for(int i = 0; i <= 5; i++ ) {
			sumTwo = sumTwo + i;
		}
		
		System.out.println("Sum of range of elements in array:" + sumTwo);
		System.out.println("Missing number is : " + (sumTwo - sumOne));
	}

}
