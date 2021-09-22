package week1.day1;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println("The number is :"+i+" and the value is TANPAN");
						
			}
			else if(i%3==0) 
			{
				System.out.println("The number is :"+i+" and the value is PAN");
				
			}
			else if(i%5==0)
			{
				System.out.println("The number is :"+i+" and the value is TAN");
			}
			else {
				System.out.println("DO nothing");
			}
		}

	}

}
