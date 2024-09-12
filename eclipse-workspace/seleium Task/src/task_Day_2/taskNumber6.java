package task_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber6 {

	

	public static void main(String[] args) throws InterruptedException {
		 WebDriver drier=new ChromeDriver();
		 
		 drier.get("https://www.swiggy.com/search");

		 
		WebElement oooo = drier.findElement(By.xpath("//span[@class='_3odgy']"));
		oooo.click();
		Thread.sleep(10000);
		 
		 WebElement txtFrom=  drier.findElement(By.xpath("//input[@placeholder='Search for area, street name..']"));
			txtFrom.sendKeys("madurai");
	}

}
