package task_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNumber5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(0);
		
	 
		
	   	WebElement txtId  = driver.findElement(By.name("fldLoginUserId"));
 	    txtId.sendKeys("seenivasan");
		  
	}
}