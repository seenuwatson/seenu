package org.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday8task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		
	WebElement btnclick = driver.findElement(By.xpath("// a[contains(text(),'Signup here')]"));
	 btnclick.click();
	 Thread.sleep(5000);
	 
	 WebElement name = driver.findElement(By.name("first_name"));
	 name.sendKeys("seenu");

	}

}

