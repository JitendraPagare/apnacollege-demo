import java.util.HashMap;
import java.util.HashSet;

import HashMap.hashmap;

public class Timepass {
	public static void main(String[] args) {
		String s="Jitu Rajendra Pagare Nanu ";
		char a[]=s.toCharArray();
		
		HashSet<Character> hs=new HashSet<>();
		
		for (Character c : a) {
			hs.add(c);
		}
		System.out.println(hs);
		
	}

}
