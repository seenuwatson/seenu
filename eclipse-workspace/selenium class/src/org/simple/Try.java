package org.simple;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Try {
	public static void main( String []args) {
		

		WebDriver driver =new  ChromeDriver();
		driver.get("http://omrbranch.com/apitestingtraininginchennaiomr");
		WebElement country = driver.findElement(By.id("country-list"));
		Select select = new Select(country) ;
		select.selectByIndex(101);
		
		List<WebElement> options = select.getOptions();
		
		for (WebElement x: options) {
			String attribute = x.getAttribute("value");
			System.out.println(attribute);
		}
		

		
	    
}
	

}


