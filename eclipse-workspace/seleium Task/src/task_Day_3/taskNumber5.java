package task_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://greenstech.in/selenium-course-content.html");
		
		
		WebElement btnclick = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		btnclick.click();
		
         WebElement txtclick2 = driver.findElement(By.xpath("//span[@class='fas fa-arrow-right']"));
		txtclick2.click();
		
		
	}

}
