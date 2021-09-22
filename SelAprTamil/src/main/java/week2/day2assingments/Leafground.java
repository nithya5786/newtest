package week2.day2assingments;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {

	public static void main(String[] args) {
		 //Pre Condition 
		WebDriverManager.chromedriver().setup();
	//Step 1:Launch chrome Browser
		ChromeDriver driver =new ChromeDriver(); 
	//Step 2:URL load   
			driver.get("http://leafground.com/pages/table.html");
	//Step 3:Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> allrows =driver.findElements(By.xpath("//table[@id='table_id']//tbody//tr//td[2]"));
		int size =allrows.size();
		//String text = allrows.get(2).getText();
		//System.out.println(text);
		for(int i=0;i<size;i++)
		{
			//List<WebElement> rows =allrows.get(i).findElements(By.tagName("td"));
			String test=allrows.get(i).getText();
			System.out.println(test);
		if(test.equals("30%"))
		{
			
				WebElement check =driver.findElement(By.xpath("(//table[@id='table_id']//tbody//tr//td[2]//following::input)[3]"));
				check.click();
		}
			
		}
	
		
	}
}


