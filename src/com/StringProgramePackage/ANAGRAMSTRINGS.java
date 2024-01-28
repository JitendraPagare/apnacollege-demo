package com.StringProgramePackage;

import java.util.Arrays;

public class ANAGRAMSTRINGS {
	public static void main(String[] args) {
		String x="ARADHYA";  // string stored in object
		String y="HRADAYA";
		
		char a[]= x.toCharArray();  // storing object string into array
		char b[]= y.toCharArray();
		
		Arrays.sort(a);// Sorting of array
		Arrays.sort(b);
		
		Boolean Result =Arrays.equals(a, b); // Compare after sorting nd store result into variable
		
		if(Result==true) {
			System.out.println("Strings are ANAGRAM");
		}
		else
		{
				System.out.println("Strinng in an NON ANAGRAM");
	    }
			
		
		
	}

}
