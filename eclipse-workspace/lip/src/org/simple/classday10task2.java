package org.simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday10task2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		 WebElement btn  = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		 btn.click();
		

	}

}
