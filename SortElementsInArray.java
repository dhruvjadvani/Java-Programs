package com.dhruv.javaprograms.sortelementsinarray;

import java.util.*;

public class SortElementsInArray {

	public static void main(String[] args) {
		
		int a[] = { 4,2,1,5,3};
		
		System.out.println("Arrays before sorting: " + Arrays.toString(a));
		
		int n = a.length;
		 
		// Bubble Sort method
	
		for(int i = 0; i < n-1; i++) {
			for (int j = 0 ; j < n-1; j++) {
				
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Arrays after sorting: " + Arrays.toString(a));
	}

}
