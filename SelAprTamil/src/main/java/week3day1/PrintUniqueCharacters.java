package week3day1;

import java.util.HashSet;
import java.util.Set;

//import io.cucumber.java.an.E;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		String name = "babu";
		char[] charac = name.toCharArray();
		Set<Character> uniqueCharac = new HashSet<Character>();
		for(int i=0;i<charac.length;i++)
		{
	   uniqueCharac.add(charac[i]);
	}
System.out.println(uniqueCharac);
	}
	
}
     