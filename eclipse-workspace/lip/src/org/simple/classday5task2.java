package org.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class classday5task2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		WebElement element = driver.findElement(By.xpath("	"));
		
	      String text = element.getText();
	       System.out.println(text);
	}

}
