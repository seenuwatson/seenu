package org.simple;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class classday13task {

	public static void main(String[] args) {
		WebDriver driver =new  ChromeDriver();
		driver.get("http://omrbranch.com/apitestingtraininginchennaiomr");
		WebElement country = driver.findElement(By.id("country-list"));
		Select select = new Select(country) ;
		select.selectByIndex(101);
		
//		print the all dropdown option count
//		get the all option
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
       options.get(99);
//		print the 10th index option text
////		1.get all the options
		List<WebElement> options2 = select.getOptions();
//		2.get the 10th index value
		WebElement element = options2.get(101);
//		3.text
		String text = element.getText();
		System.out.println(text);
//		
//		print the allm option text
//		1.get the all option
//		List<WebElement> options3 = select.getOptions();
//		for (int i=0; i<options3.size();i++) {
//			WebElement element2 = options3.get(i);
//			String text2 = element2.getText();
//		    System.out.println( text2);
		
		for (int i = 0; i < options.size(); i++) {
			WebElement text6 = options.get(i);
			String text23 = text6.getText();
			System.out.println(text23);
			
		}
			driver.close();
		
	
		
			
		
			
}}
