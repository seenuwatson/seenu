package org.simple;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classday7task2 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.omrbranch.com/");
		
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(file);
		
		File desflie = new File("D:\\Downloads\\seenu.png");
		
	   FileUtils.copyFile(file, desflie);
	   
	   WebElement element2 = driver.findElement(By.name("email"));
		File screenshotAs = element2.getScreenshotAs(OutputType.FILE);
		
		File file2 = new File("D:\\Downloads\\seenu1.png");
		FileUtils.copyFile(screenshotAs, file2);
		
	   
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("seeniwatson@AS56");
		String txtemail = txtEmail.getAttribute("value");
		System.out.println(txtemail);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("watson");
		String txtpass = txtPass.getAttribute("value");
		System.out.println(txtpass);
		
		WebElement btnclick = driver.findElement(By.xpath("//input[@type='checkbox']"));
		btnclick.click();
		
		WebElement element = driver.findElement(By.xpath("// h1[contains(text(),'F')]"));
		String text = element.getText();
		System.out.println(text);
		
		WebElement element1 = driver.findElement(By.xpath("// p [contains(text(),'P')]"));
		String text2 = element1.getText();
		System.out.println(text2);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.manage().window().maximize();
		
		
		


	}

}
