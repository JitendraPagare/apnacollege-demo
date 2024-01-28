package com.StringProgramePackage;

public class LenghtOfStriing1 {

	public static void main(String args[]){
		
		 String x = "DYPatil College";
		 
		x= x.concat("\0");
		char y[] =x.toCharArray();
		
		int count = 0;
		int i=0;
		
		while(y[i]!='\0');
		{
			++count;
			++i;
		}
		System.out.printf("%d", count);
		
			
		}
		
	}

