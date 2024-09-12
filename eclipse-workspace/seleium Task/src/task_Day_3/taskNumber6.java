package task_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber6 {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement btnAcc = driver.findElement(By.xpath("//i[@class='icon icon-down icon_secondary_item_more']"));
		btnAcc.click();
		
		WebElement btnlogin = driver.findElement(By.id("user_sign_in_sign_up"));
		btnlogin.click();
		
		WebElement findElement = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	   driver.switchTo().frame(findElement);
		
	WebElement btn = driver.findElement(By.id("mobileNoInp"));
	btn.sendKeys("99987987");
		
		
		
		
		
	}

}
