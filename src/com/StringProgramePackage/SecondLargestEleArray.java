package com.StringProgramePackage;

public class SecondLargestEleArray {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				System.out.println("second largest ele :"+a[1]);
			}
			
		}
	}

}
