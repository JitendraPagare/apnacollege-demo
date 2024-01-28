package com.StringProgramePackage;

public class CountUpperCaseChar {
	public static void main(String[] args) {
		String str="JITEndra";
		int count=0;
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				count++;
			}
		}System.out.println(count);
	}

}
