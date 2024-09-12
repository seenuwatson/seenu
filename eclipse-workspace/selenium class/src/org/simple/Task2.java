package org.simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.omrbranch.com/");
		  
		  String title = driver.getTitle();
		  System.out.println(title);
		  
		  String url = driver.getCurrentUrl();
		  System.out.println(url);
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().window().maximize();

	}

}
