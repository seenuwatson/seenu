package task_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber10 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://adactinhotelapp.com/");
		  WebElement txtid = driver.findElement(By.id("username"));
		  txtid.sendKeys("seenivasan");
		  
		  WebElement txtPass = driver.findElement(By.id("password"));
		  txtPass.sendKeys("ooooooooo");
		  driver.close();

	}

}
