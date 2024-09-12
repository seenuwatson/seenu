package task_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber8 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement btnresume = driver.findElement(By.xpath("//h2[@class='mb-0']"));
		btnresume.click();
		WebElement btnmodal = driver.findElement(By.xpath("//a[@title='Model Resume training in chennai']"));
		btnmodal.click();;
		driver.close();
		
	}

}
