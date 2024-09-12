package task_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement txtId = driver.findElement(By.id("twotabsearchtextbox"));
	    txtId.sendKeys("iphone");
	    
	    WebElement btnsreach = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    btnsreach.click();
	    
	    driver.close();

	}

}
