package HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void getCharOccurance(String name) {

		Map<Character,Integer> hs=new HashMap<Character,Integer>();
		char strArray[]=name.toCharArray();
		for (char c: strArray) {

			if(hs.containsKey(c)) {
				hs.put(c,hs.get(c)+1);

			}else {
				hs.put(c, 1);
			}
		}
		System.out.println(name+" : "+hs);


	}
	public static void main(String[] args) {

		getCharOccurance("Jiteendra");

	}

}
