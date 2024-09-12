package org.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classday4task {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement txtId  =	 driver.findElement(By.id("email"));
	txtId.sendKeys("seenu");
	
	WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("dgubjhuhdv");
		
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnlogin.click();
	
		
		

	}

}
