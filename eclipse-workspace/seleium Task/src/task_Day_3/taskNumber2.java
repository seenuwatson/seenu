package task_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber2 { 
	 public static void main(String []args) {
		 
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  
		  WebElement txtId = driver.findElement(By.id("email"));
		  txtId.sendKeys("9994816808");
		  
		  WebElement txtpass = driver.findElement(By.id("pass"));
		  txtpass.sendKeys("28Watson");
		  
		  WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
		  btnlogin.click();
		  
		  driver.close();
		  
		
	}

}
