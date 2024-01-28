package com.StringProgramePackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueChar {
	public static void main(String[] args) {
		String x="SPIDERMAN";
		char y[]=x.toCharArray();
		int size = y.length;
		
		Map<Character,Integer> map= new HashMap<>();
		int i=0;
		while(i != size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}	
			else
			{
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}	
			++i;
		}	
		Set<Map.Entry<Character,Integer>> hmap= map.entrySet();
		for(Map.Entry<Character,Integer> data : hmap)
		{
			if(data.getValue()>1)
			{
				System.out.println("Doesn't contain all unique character");
				System.exit(0);
			}	
		}
		System.out.println("Contains a unique character");
		
	}

}
