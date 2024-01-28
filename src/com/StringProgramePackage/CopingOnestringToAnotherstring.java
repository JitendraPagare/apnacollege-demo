package com.StringProgramePackage;

public class CopingOnestringToAnotherstring {
	public static void main(String[] args) {
		String x ="ABC tech";   //string declare keli
		
		char y[]= x.toCharArray();  //obj to array conversion
	
		int size=y.length;   //size ref variable madhye paste keli
		char a[]=new char[size];  //size ya size new arry create kela
		
		int i=0;   //variable to travel along array
		
		while(i!=size) {
			a[i] = y[i];  //tranfering variable to new variable
			
			++i;
		}
		
		System.out.println(y);   //printing previous variable
		System.out.println(a);    //printing new variable....both to compare
		
	}

}
