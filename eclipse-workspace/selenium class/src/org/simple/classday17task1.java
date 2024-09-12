package org.simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday17task1 {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		
	       driver.findElement(By.tagName("frame"));
	     //swich to frame by using index
//	       driver.switchTo().frame(0);
	       
	       //swich to frame by using id or name 
//	       driver.switchTo().frame("login_page");
	       
	       //swith to frame by using webelement
//	     WebElement findElement = driver.findElement(By.xpath("//frame[@name='login_page']"));
//	     driver.switchTo().frame(findElement);
	      
	     WebElement txtsearch = driver.findElement(By.name("fldLoginUserId"));
	     txtsearch.sendKeys("nakku");
	     }
}
