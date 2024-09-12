package org.simple;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday18task1 {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement btnok = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel']"));
		btnok.click();
//		Robot robot=new Robot();
//				robot.keyPress(KeyEvent.VK_ENTER);
//				robot.keyRelease(KeyEvent.VK_ENTER);
//				
//		driver.findElement(by.)
		
	

	}

}
