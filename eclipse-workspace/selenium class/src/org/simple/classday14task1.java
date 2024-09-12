package org.simple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class classday14task1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		WebElement skills = driver.findElement(By.id("skills"));
		Select select=new Select(skills);
//		select.selectByIndex(1);
//		select.selectByIndex(2);
//		select.selectByIndex(0);
		
		//select all option by index 
		//1. get the all option
		List<WebElement> options = select.getOptions();
		//2. iterate all option 
		for (int i = 0; i < options.size() ; i++) {
			//2.1 select each option by intex
			select.selectByIndex(i);
			
			
			
		
	}}

}
