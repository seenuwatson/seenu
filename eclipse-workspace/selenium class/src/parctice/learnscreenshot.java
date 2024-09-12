package parctice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnscreenshot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		 File file1 =new File("D:\\\\Pictures\\\\New folder\\\\ajith788.png");
		 FileUtils.copyFile(screenshotAs, file1);
		
		
	
		WebElement amazonimg = driver.findElement(By.id("nav-logo-sprites"));			
   		File file = amazonimg.getScreenshotAs(OutputType.FILE);
   		File target=new File("D:\\Pictures\\New folder\\ajith.png");
			FileUtils.copyFile( file , target);
			
		WebElement bike = driver.findElement(By.xpath("//img[@alt='Hero Super Splendor (Drum) Bike Booking for Ex-Showroom Price (Black And Accesnt)']"));
		File  bikeimg = bike.getScreenshotAs(OutputType.FILE);
		File take = new File("D:\\Pictures\\New folder\\ajithbke.png");
		FileUtils.copyFile(bikeimg, take);
		
		WebElement menst = driver.findElement(By.xpath("//ul[@class='a-unordered-list a-nostyle a-horizontal feed-carousel-shelf']"));
		File menimg = menst.getScreenshotAs(OutputType.FILE);
		File take2 =new File("D:\\Pictures\\New folder\\ajithmen.png");
	    FileUtils.copyFile(menimg, take2);
	    
	    driver.findElement(By.name("field-keywords")).sendKeys("iphone");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    
	    TakesScreenshot screenshot2=(TakesScreenshot)driver;
	    File screenshotAs21 = screenshot2.getScreenshotAs(OutputType.FILE);
	    File take3= new File("D:\\Pictures\\New folder\\ajith568.png");
	    FileUtils.copyFile(screenshotAs21, take3);
	    
	    
	driver.close();	
	}

}
