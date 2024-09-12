package org.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday4task2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.omrbranch.com/");

	 WebElement txtEmailId =	 driver.findElement(By.id("email"));
		 txtEmailId.sendKeys("seenivasan4320");
	
	WebElement txtPassword=	 driver.findElement(By.id("pass"));
	 txtPassword.sendKeys("seenu55555");
	  
	 WebElement btnlogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnlogin.click();
	}

}
