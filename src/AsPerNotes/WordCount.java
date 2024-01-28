package AsPerNotes;

public class WordCount {
     public static void main(String[] args) {
    	 String s ="Jitu Rajendra Pagare ";
         int count=1;
         for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==' '&& i<s.length()-1 && s.charAt(i+1)!=' ') {
				count++;
			}
		}
         System.out.println(count);
	}/*s.charAt(i) == ' ': Checks if the character at index i in the string s is a space (' ').
       i < s.length() - 1: Ensures that i is less than the index of the last character in the string.            
                           This prevents going out of bounds.
       s.charAt(i + 1) != ' ': Checks if the character immediately following the one at index i is not a space (' ').
	*/
}
