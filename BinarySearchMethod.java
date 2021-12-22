package com.dhruv.javaprograms.searchingelementsinarray;

public class BinarySearchMethod {

	public static void main(String[] args) {
		
		int a[] = { 1,2,3,4,5,6,7,8,9,10}; // should be in sorted order
		
		boolean flag = false;
		int key = 2;
		int low = 0;
		int high = a.length - 1;
		
		
		while(low <= high) {
			int m = (low + high)/2;
			if(a[m] == key) {
				System.out.println("Elements Found");
				flag = true;
				break;
			}
			if(a[m] < key) {
				low = m + 1;
			}
			if(a[m] > key) {
				high = m - 1;
			}
		}
		
		
		
		if(flag == false) {
			System.out.println("Elements not found");
		}
		
		
	}

}
