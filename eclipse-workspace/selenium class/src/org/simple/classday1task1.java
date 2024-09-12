package org.simple;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 
public class classday1task1 {
	public static void main (String []args ) {
		 
		WebDriver san=new ChromeDriver();
		   // WebDriver  ----> interface
		   // ChromeDriver --> class name 
		   // new -----------> keyword 
		   // driver --------> object ref
		
		// new keyword its used to create new object.
		san.get("https://www.facebook.com/");
		   
		//get() --> Method which in present on WebDriver interface
		
		//To get the title of page --> get title ()--> WebDriver
		String title = san.getTitle();
		System.out.println(title);
		
		// To get the URL of the page-->getCurrentUrl()-->WebDriver
	   String currentUrl= san.getCurrentUrl();
	   System.out.println(currentUrl);
	// close to browser   
	// close ()---> WebDriver
	   san.close();
	}
}
