package com.dhruv.javaprograms.sortelementsinarray;

import java.util.Arrays;

public class BuiltInSortMethod {

	public static void main(String[] args) {
		
		int a[] = { 4,2,1,5,3};
		
		System.out.println("Arrays before sorting: " + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("Arrays after sorting: " + Arrays.toString(a));
	}

}
