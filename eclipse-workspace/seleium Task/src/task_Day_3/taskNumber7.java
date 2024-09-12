package task_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber7 {

	public static void main(String[] args) throws InterruptedException, Exception {
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
	
		WebElement from = driver.findElement(By.xpath("//input[@title='From station']"));
		from.sendKeys("madurai");
		 WebElement to = driver.findElement(By.xpath("//input[@title='To station']"));
		 to.sendKeys("chennai");
		 
		 WebElement btnclick = driver.findElement(By.id("trainFormButton"));
		 btnclick.click();
		driver.close();
	}

}


// WebElement btnclass = driver.findElement(By.xpath("//select[@id='trainClass']"));
// btnclass.click();


//Robot robot=new Robot();
//robot.keyPress(KeyEvent.VK_DOWN);
//robot.keyPress(KeyEvent.VK_DOWN);
//robot.keyRelease(KeyEvent.VK_DOWN);
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
