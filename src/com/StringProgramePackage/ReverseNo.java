package com.StringProgramePackage;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String args[])
	{ int n;
	System.out.print("Enter No of term");
	Scanner sc =new Scanner(System.in);
	n=sc.nextInt();

	for(int i=0; i<=n ; i=i+2){
	System.out.print(i + " ");
	} 
	}

}
