package com.dhruv.javaprograms.searchingelementsinarray;

public class LinearSearchMethod {

	public static void main(String[] args) {
		
		int a[] = {10,20,40,50,30};
		int search = 50;
		boolean flag = false;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if(search == a[i]) {
				System.out.println("Elements found at: " + i);
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Element not found");
		}
	}

}
