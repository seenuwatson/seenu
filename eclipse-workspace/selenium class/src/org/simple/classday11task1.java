	package org.simple;
	
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class classday11task1 {
		public static void main(String[]args) throws Exception {
			WebDriver driver=new ChromeDriver();
//			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Actions actions=new Actions(driver);
//			WebElement txtsearch = driver.findElement(By.id("APjFqb"));
//			txtsearch.sendKeys("seeniwatson");
//			actions.doubleClick(txtsearch).perform();
//			
			WebElement txtgmail = driver.findElement(By.xpath("//a[@class='gb_y']"));
			
			actions.contextClick(txtgmail).perform();
	
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
}}
