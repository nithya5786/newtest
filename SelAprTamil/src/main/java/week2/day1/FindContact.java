package week2.day1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) throws InterruptedException {
		//Pre Condition 
				WebDriverManager.chromedriver().setup();
			//Step 1:Launch chrome Browser
				ChromeDriver driver =new ChromeDriver(); 
			//Step 2:URL load   
				driver.get("http://leaftaps.com/opentaps");
			//Step 3:Maximize
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Step 4:Find the username and type the value
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			//Step 5:Find the password and type th  e value
				driver.findElement(By.id("password")).sendKeys("crmsfa");
			//Step 6 :Find the Login button and click	
				driver.findElement(By.className("decorativeSubmit")).click();
			//Step 7: Verify logged in
				String text =driver.findElement(By.tagName("h2")).getText();
				System.out.println(text);
			//Step 8 :Click CRMSFA link	
				driver.findElement(By.linkText("CRM/SFA")).click();
			//Click Contact
				driver.findElement(By.linkText("Contacts")).click();
			//Find Contacts
			    driver.findElement(By.linkText("Find Contacts")).click();
			 //Click Email
			    driver.findElement(By.linkText("Email")).click();
			  //Enter Email id
			    driver.findElement(By.name("emailAddress")).sendKeys("XYZ@gmail.com");
			   //Click Find Contacts
			    driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		      Thread.sleep(2000);
			    //Click on SecondLink
			   // driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/following::table/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		      driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
	}
}
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
				

	


