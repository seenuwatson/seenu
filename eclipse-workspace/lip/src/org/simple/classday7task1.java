package org.simple;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday7task1 {


	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		 
	   WebElement loginbtn = driver.findElement(By.name("login"));
	   File file = loginbtn.getScreenshotAs(OutputType.FILE);
	    
	   File target  = new File("D:\\Downloads\\seeenung.png");
	   
	   FileUtils.copyFile( file , target);
	}}
