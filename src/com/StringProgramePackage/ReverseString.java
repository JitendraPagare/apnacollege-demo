package com.StringProgramePackage;

public class ReverseString {
	public static void main(String[] args) {
		String x="ABC tech";
		char y[]=x.toCharArray();
		
		int size = y.length;
		char a[]=new char[size];
		
		int i=0;
		while(i!=size){
			
			a[size-1-i]=y[i];
			++i;	
		}
		System.out.println(y);
		System.out.println(a);
	}

}
