package PracString;

import java.util.LinkedHashSet;

public class duplicateCharacterInString {
	
	
	public static void main(String[] args) {
		String str="Automationt";
		int count=0;
		char[] ch= str.toCharArray(); //Converting string to array
		
		
		for (int i=0; i< ch.length ;i++) {  //this for is to iterate entire character array
			for(int j=i+1;j<ch.length;j++) { //To iterate current string
				if (ch[i]==ch[j]) {
	 				System.out.println(ch[j]);
					count++;
				}
			}	
		}
		System.out.println("duplicate charachter is:" +count);
		System.out.println(count);
	}

}
