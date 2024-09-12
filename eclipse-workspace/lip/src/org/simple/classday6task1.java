package org.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday6task1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("9994816808");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("watson");
		
		String emailtxt = txtEmail.getAttribute("value");
		System.out.println(emailtxt);
	
		String passtxt = txtPass.getAttribute("value");
		System.out.println(passtxt);
		
		
		
		
		

	}

}
