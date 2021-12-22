package com.dhruv.javaprograms.randomnum;

import java.util.Random;

public class RandomNumDouble {

	public static void main(String[] args) {
		
		Random rand = new Random();
		double randDbl = rand.nextDouble(); // return values from 0 to 1
		System.out.println(randDbl);
	}

}
