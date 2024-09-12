package org.simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {
	public static void main( String []args) {
		
		WebDriver san=new ChromeDriver();
		
		san.get("https://kuttywap.in/index.php?dir=/Tamil%20Mp3%20Songs&p=1&sort=0");
		
		
		String title = san.getTitle();
		System.out.println(title);
		
		String currentUrl = san.getCurrentUrl();
		System.out.println(currentUrl);
		
		String page=  san.getPageSource();
	   System.out.println(page);
	    
}
	

}


