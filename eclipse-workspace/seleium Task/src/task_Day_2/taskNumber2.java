package task_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber2 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.redbus.in/");
		WebElement txtFrom=  driver.findElement(By.id("src"));
		txtFrom.sendKeys("madurai");
		  
		WebElement txtTo = driver.findElement(By.id("dest"));
		 txtTo.sendKeys("chennai");
		 

	}

}



