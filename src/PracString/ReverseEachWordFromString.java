package PracString;

public class ReverseEachWordFromString {
	public static void main(String[] args) {
		//1. Split the string into words and store into an array
		//2. reverse each word
		//3. Again store each rev word in string and print that
		
		
		
		
		String str="Welcome To Java";
		String[] words=str.split(" "); //Splitting string into words
		String reverseString="";
		
		for (String w : words) {   // one by one words are into into w from array words
			String reversword="";
			
			for(int i=w.length()-1;i>=0;i--) {   //login to rev each word 
				
				reversword=reversword+w.charAt(i);	//Adding each char of word int revWrd
			}
			 reverseString=reverseString+reversword+" ";// Again storing each revwrd into one string
		}                                           //while each word we append or say add space
		
		System.out.println(reverseString);
	}

}
