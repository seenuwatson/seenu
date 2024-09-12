package parctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnframe {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alertsWindows");
		WebElement btn = driver.findElement(By.xpath("//div[@class='header-text']"));
		btn.click();
		driver.close();
	}

}
