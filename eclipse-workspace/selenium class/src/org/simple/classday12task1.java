package org.simple;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday12task1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/");
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
	    robot.keyPress(KeyEvent.VK_S);
	    robot.keyRelease(KeyEvent.VK_S);
	    robot.keyPress(KeyEvent.VK_E);
	    robot.keyRelease(KeyEvent.VK_E);
	    robot.keyPress(KeyEvent.VK_E);
	    robot.keyRelease(KeyEvent.VK_E);
	    robot.keyPress(KeyEvent.VK_N);
	    robot.keyRelease(KeyEvent.VK_N);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    robot.keyRelease(KeyEvent.VK_SHIFT);
	    
	    robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
	    robot.keyPress(KeyEvent.VK_9);
	    robot.keyRelease(KeyEvent.VK_9);
	    robot.keyPress(KeyEvent.VK_7);
	    robot.keyRelease(KeyEvent.VK_7);
	    robot.keyPress(KeyEvent.VK_E);
	    robot.keyRelease(KeyEvent.VK_E);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_SHIFT);
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);

		}

}
