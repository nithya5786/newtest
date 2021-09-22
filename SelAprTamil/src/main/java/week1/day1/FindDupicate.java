package week1.day1;

public class FindDupicate 
{

	public static void main(String[] args) 
	{
		
	String input ="testleaf";
	char[] characters = input.toCharArray();
	boolean bFoundDuplicate=false;
	for (int i=0;i<characters.length;i++) 
	{
		for(int i1=i+1;i1<characters.length;i1++)
		{
		if(characters[i]==characters[i1])
		{
			System.out.println("This is the duplicate :"+characters[i1]);
			bFoundDuplicate=true;
	break;
	 	}
		if(bFoundDuplicate)
			break;
		
		if(!bFoundDuplicate)
			System.out.println("No dups Found");
	}
			
	}
	
	
	
	
	

				
			
		
	
	

	}

}
