package task_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 //
		 driver.get("https://www.facebook.com/");
		WebElement txtId=  driver.findElement(By.id("email"));
		txtId.sendKeys("madurai");
		  
		WebElement txtPassword = driver.findElement(By.id("pass"));
		 txtPassword.sendKeys("chennai");
		 
		   WebElement btnlogin =driver.findElement(By.xpath("//button[@value='1']"));
		     btnlogin.click();
		 
	      driver.close();
	}

}
