package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
	
	email.sendKeys("seeenuvasan");
	
	driver.findElement(By.id("pass")).sendKeys("watson");
	driver.findElement(By.name("login")).click();
	
	driver.close();
	

}}
