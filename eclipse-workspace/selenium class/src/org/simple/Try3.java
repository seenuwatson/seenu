package org.simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try3 {

	public static void main(String[] args) {
		
		 WebDriver san=new ChromeDriver();
		 
		 san.get("https://www.facebook.com/");
		 
		  String title = san.getTitle();
		  System.out.println(title);
		 
		 String currrentUrl = san.getCurrentUrl();
		  System.out.println(currrentUrl);
		
		 san.manage().window().minimize();
		  
		 san.close();
		

	}

}
