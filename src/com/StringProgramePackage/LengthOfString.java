package com.StringProgramePackage;

public class LengthOfString {
	public static void main(String[] args) {
		
		String x="ABC tech"; //declaring string
		
		x=x.concat("\0");   //add null char at end of string
		char y[]=x.toCharArray();  //convert string to array
		
		//declaring two variables
		int count=0;   //to count characters
		int i=0;  //to travel through array
		
		while(y[i]!='\0') {
			
			++count;
			++i;
		}
		System.out.printf("%d", count);
	
	}

}
