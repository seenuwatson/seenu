package parctice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnAlart {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("confirm alert= "+text);
		alert.dismiss();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("java");
		String text2 = alert2.getText();
		System.out.println("prompt alert= "+ text2);
		
		driver.close();
	}

}
