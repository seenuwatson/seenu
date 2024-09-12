package org.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday5task1 {

	



	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.xpath("// a[contains(text(),'Conditions')]"));
		String text = element.getText();
		System.out.println(text);
	
	

	}

}
