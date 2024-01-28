package com.StringProgramePackage;

public class ConvertLowercaseToUppercasewithSpace {
	public static void main(String[] args) {
		String x="jitendra rajendra pagare";
		char y[]= x.toCharArray();
		int size=x.length();
		
		int i=0;
		while(i!=size) {
			
			if(y[i]!=' ')  // hi if chi condition for counting space in string
			{
				
			y[i]=(char)	(y[i]-32);	// formula for lower to upper case conversion	
			}
			i++;
		}
		System.out.println(x);
		System.out.println(y);
	}

}
