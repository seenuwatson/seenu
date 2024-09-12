package parctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String text2 = text.getText();
		System.out.println(text2);
		
		WebElement text1 = driver.findElement(By.id("reg_pages_msg"));
		String text3 = text1.getText();
		System.out.println(text3);
		driver.close();
		
		
		
		
		
	}

}
