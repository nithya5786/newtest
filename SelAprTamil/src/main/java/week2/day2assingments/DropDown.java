package week2.day2assingments;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.findElement(By.xpath("//select[@class='dropdown']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select dropdown = new Select(element);
		List<WebElement> list = dropdown.getOptions();
		int size = list.size();
		dropdown.selectByIndex(size - 2);
		
	}

}
