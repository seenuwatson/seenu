package org.simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday3Task {

	public static void main(String[] args) {
		
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.get("https://www.redbus.in");
	 driver.get("https://www.google.com/");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().to("https://www.facebook.com/");
	 driver.navigate().refresh();
	}

}
