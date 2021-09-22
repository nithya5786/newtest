package week3day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.internal.runners.model.EachTestNotifier;

public class FindMostDuplicateNumber {

	public static void main(String[] args) 
	{
		String str ="abbaba";
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : arr) {  
            if (map.containsKey(ch)) {  
                map.put(ch, map.get(ch) + 1);  
            } else {  
                map.put(ch, 1);  
            }  
			
            System.out.println(map);
		}
		 /*Set<Character> keys = map.keySet();  
	        for (Character ch : keys) {  
	            if (map.get(ch) > 1) {  
	                System.out.println(ch + "  is " + map.get(ch) + " times");  
	            }*/  
	        

	}
	}



