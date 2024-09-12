package org.simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class classday10task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		Actions actions = new Actions (driver);
		
	WebElement s = driver.findElement(By.id("credit2"));
	WebElement d = driver.findElement(By.id("java-class"));
	actions.dragAndDrop(s, d).perform();
	
   WebElement s2 = driver.findElement(By.id("fifth"));
   WebElement d2 = driver.findElement(By.id("selenium-class"));
   actions.dragAndDrop(s2, d2).perform();
   
   WebElement s3 = driver.findElement(By.id("fourth"));
   WebElement d3 = driver.findElement(By.id("java-interface"));
   actions.dragAndDrop(s3, d3).perform();
   
   WebElement s4 = driver.findElement(By.id("credit1"));
   WebElement d4 = driver.findElement(By.id("selenium-interface"));
   actions.dragAndDrop(s4, d4).perform();
	
   WebElement btnresult = driver.findElement(By.id("result"));
   Thread.sleep(5000);
   btnresult.click();
   
   driver.close();
	
	

	}

}
