package PracString;

public class ReverseEachWordFromString2 {
	
	public static void main(String[] args) {
		String str="Welcome To Java jitu";
		String[] words=str.split("\\s"); //instead of space regular expression 
		
		String reverseword="";
		
		for (String w : words) {
			StringBuilder sb=new StringBuilder(w); //one by one word wld be stored into sb
			sb.reverse();//Each word is reversed
			
			reverseword=reverseword+sb.toString()+" ";//again converting into string storing into one string
		}
		
		System.out.println(reverseword);
	}

}
