package org.simple;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class Try2 {
	
	public static void main (String[]args) {
		
		WebDriver san=new ChromeDriver();
		 san.get("https://www.facebook.com/");
		
		 
	 WebElement element = san.findElement(By.xpath("//h2[contains(text();'F')]"));
	 String text = element.getText();
	 System.out.println(text);
	}
}

 //String title = san.getTitle();
//System.out.println(title);
//String currentUrl = san.getCurrentUrl();
//System.out.println(currentUrl);