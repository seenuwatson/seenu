package org.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class classday15task1 {
	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	 //type casting
	JavascriptExecutor dj =(JavascriptExecutor)driver;
	 driver.get("https://www.facebook.com/");
	//insert value using javascriptExecutor
//	 WebElement txtemail = driver.findElement(By.id("email"));
//	 dj.executeScript("arguments[0].setAttribute('value','seenu')",txtemail);
	 
	WebElement txtpass = driver.findElement(By.id("pass"));
	dj.executeScript("arguments[0].setAttribute('value','seenu')",txtpass);

	 WebElement login = driver.findElement(By.name("login"));
	 dj.executeScript("arguments[0].click()",login);
}}
