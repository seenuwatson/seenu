package task_Day_3;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class taskNumber3 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement txtName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtName.sendKeys("seenu");
		
		WebElement txtlastName= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlastName.sendKeys("watson");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("madurai");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("seeniwatson4320");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9996868834");
		
		WebElement btngender = driver.findElement(By.xpath("//input[@value='Male']"));
		btngender.click();
		
		WebElement hobbies = driver.findElement(By.id("checkbox1"));
		hobbies.click();
		
	//	WebElement language = driver.findElement(By.id("msdd"));
	//	language.sendKeys("tamil");
		
		WebElement skills = driver.findElement(By.id("Skills"));
		skills.click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement country = driver.findElement(By.id("country-list"));
		Select select=new Select(country);
		select.selectByIndex(101);
		
		

	}

}
