package task_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.instagram.com/accounts/login/?hl=en");
		 Thread.sleep(5000);
		 
		 WebElement txtEmail = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		 txtEmail.sendKeys("999481608");
		WebElement txtPassword =  driver.findElement(By.xpath("//input[@aria-label='Password']"));
		txtPassword.sendKeys("999486808");
		
	driver.close();
	}

}
