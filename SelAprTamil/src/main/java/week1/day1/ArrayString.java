package week1.day1;

public class ArrayString {

	public static void main(String[] args) {
		int [] input = {1, 2, 3, 4, 5};  
        int k = 5;  
       boolean bMatch=false;
       for(int i=0;i<input.length;i++) {
    	   for(int j=i+1;j<input.length;j++) {
    		   if(input[i]+input[j]==k)
    		   {
    			   bMatch=true;
    			   System.out.println("True");
    			   break;
    		   }
    	   
       }
          if(bMatch) 
        	  break;
	
	if(!bMatch) 
		System.out.println("False");
       }
	}
}
          
	
	
        
         
         
        
      



