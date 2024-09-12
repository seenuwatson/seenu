package org.simple;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday2Task1 {
	

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		 
		  driver.get("https://www.omrbranch.com/");
		  // find and verify the locator of username taxtbox id="email"
	 WebElement txtEmailId =	 driver.findElement(By.id("email"));
	 //insert value in taxtbox 
		 txtEmailId.sendKeys("seenivasan4320");
		 //find  and verify the locator f password textbox id ="pass"
	WebElement txtPassword=	 driver.findElement(By.id("pass"));
	 txtPassword.sendKeys("seenu55555");
	 
	 
	
	}

}
