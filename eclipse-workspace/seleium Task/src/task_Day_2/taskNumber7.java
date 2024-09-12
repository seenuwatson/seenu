package task_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber7 {
	public static void main (String []args ) {
		
 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.snapdeal.com/login");

		 
		 WebElement txtId=  driver.findElement(By.id("userName"));
			txtId.sendKeys("seeniivasan");
			
			
	}

}
