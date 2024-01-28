import java.util.HashSet;

public class RemoveDuplicateCharInString {
	public static void main(String[] args) {
		String s="abcabcdef";
		char arr[]=s.toCharArray();

		HashSet<Character> hs=new HashSet<Character>();
		for (char c:arr) {
			hs.add(c);
		}

		for (int i=0; i< arr.length ;i++) {  
			for(int j=i+1;j<arr.length;j++) { 
				if (arr[i]==arr[j]) {
					hs.remove(arr[i]);
				}
			}	
		}System.out.println(hs);
	}
}
