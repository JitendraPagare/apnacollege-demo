package com.StringProgramePackage;

public class ConvertLowercaseToUppercase {
	public static void main(String[] args) {
		String x= "jitendra";
		char y[]=x.toCharArray();
		
		int size= x.length();
		
		int i=0;
		while(i!=size) {
			y[i]=(char)(y[i]-32);   //for lower case-->> y[i]=(char)(y[i]+32)
			i++;
		}
		System.out.println(x);
		System.out.println(y);
	}

}
