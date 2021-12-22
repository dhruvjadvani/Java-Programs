package com.dhruv.javaprograms.randomnum;

import java.util.*;

public class RandomNum {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int randInt = rand.nextInt(10);
		
		System.out.println(" Random Number between 1 to 10: " + randInt);
		
	}
}
