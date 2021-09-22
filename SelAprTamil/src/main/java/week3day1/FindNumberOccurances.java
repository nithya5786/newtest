package week3day1;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOccurances {

	public static void main(String[] args) {
		int[] number = {2,3,6,5,7,3,-1};
	
		Map<Integer ,Integer> map =new TreeMap<Integer,Integer>();
      for(int i=0;i<number.length;i++)
      {
    	  if(map.containsKey(number[i])) {
    		  Integer value = map.get(number[i]);
    		  int newvalue = value+1;
    		  map.put(number[i], newvalue);
    		  
    	  }
    	  else
    	  {
    		  map.put(number[i], 1);
    		  
    		  
    	  }
    	  System.out.println(map);
      }
	}

}
