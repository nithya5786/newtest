package week1.day1;

public class Bicycle 
{
	//method for getCycleColor
	public String getCycleColor() 
	{
return "blue";
	}
	public boolean isPuncture() 
	{
		return false;
	}

	
	public static void main(String[] args) 
	{
		Bicycle c = new Bicycle();
		String color =c.getCycleColor();
		System.out.println(color);
		boolean puncture=c.isPuncture();
		System.out.println(puncture);
	}
	}

