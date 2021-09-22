package week2.day1;


import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgressFirst {

	public static void main(String[] args) 
	{
		//Pre Condition 
		WebDriverManager.chromedriver().setup();
	//Step 1:Launch chrome Browser
		ChromeDriver driver =new ChromeDriver(); 
	//Step 2:URL load   
		driver.get("http://leafground.com/pages/table.html");
	//Step 3:Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//List<WebElement> progressPercentage = driver.findElements(By.xpath("//table[@id='table_id']//td[2]"));
		List<WebElement> progressPercentage = driver.findElements(By.xpath("//table[@id='table_id']//tr//td[2]"));
		
	for(int i=0;i<progressPercentage.size();i++) {
		System.out.println(progressPercentage.get(i).getText());
		
	}
		
		
		
		

		

	}

}
