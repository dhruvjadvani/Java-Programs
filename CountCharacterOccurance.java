package com.dhruv.javaprograms.countoccurancesofchar;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String str = "Java Programming Tutorial";
		
		int  totalcount = str.length();
		int totalcountAfterRemove = str.replace("a", "").length();
		
		int count = totalcount - totalcountAfterRemove;
		System.out.println("Num occurance of a is " + count);
	}

}
