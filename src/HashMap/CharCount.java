package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	
	public static void getCharCount(String name) {
		//name=name.replace(" ", "");   // Incase doesn't want space
		Map<Character,Integer> charMap=new HashMap<Character, Integer>();
		char strArray[]= name.toCharArray();  //Coverting string into charArray
		for (char c : strArray) {  // Iterating an array using for-each loop
			if (charMap.containsKey(c)) {  //containskey chk karte chr ahe ka nahi te  
				charMap.put(c,charMap.get(c)+1);  //_ _ _t
			}else {
				charMap.put(c, 1);  //tes
			}
		} System.out.println(name + " :  "+ charMap);
	}
	
	public static void main(String[] args) {
		getCharCount("test");  //Mtd is called with its name
	
		getCharCount("tt  tt");// 
		getCharCount("testing java test");
		getCharCount("Jitendra Rajendra Pagare jrp");
		
	}

}
