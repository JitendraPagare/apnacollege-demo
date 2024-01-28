package com.StringProgramePackage;

import java.util.Arrays;

public class ANAGARAMSTRINGS2 {
	public static void main(String[] args) {
		String x="HE Is aRDhAYA";
		String y="is he HRADAYA";
		
		x=x.replace("  ", "");  //Space is Eliminated by .replace mtd
		y=y.replace("  ", "");
		x=x.toLowerCase();      //Convert string into lower case
		y=y.toLowerCase();
		
		char a[]= x.toCharArray();   //toCharArray ne objt string into Array  convert keli
		char b[]= y.toCharArray();
		
		Arrays.sort(a);  //sort array by .sort mtd
		Arrays.sort(b);
		
		Boolean result=Arrays.equals(a, b);   //compare Array by equals mtd
		
		if (result==true) {
			System.out.println("String is ANAGRAM");
		}
		else {
			System.out.println("String are not ANAGRAM");
		}
		
		
		
	}

}
