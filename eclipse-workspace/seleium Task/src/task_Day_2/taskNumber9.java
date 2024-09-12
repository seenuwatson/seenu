package task_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber9 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.automationtesting.in/Register.html");
		 WebElement txtFristName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		      txtFristName.sendKeys("seenu");
		 WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		     txtLastName.sendKeys("seenuuuu");
		 WebElement txtAddress= driver.findElement(By.xpath("//textarea[@rows='3']"));
            txtAddress.sendKeys("madurai tn 59");
          WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
            txtEmail.sendKeys("seeniwatson432gmail.com");
            WebElement phNumber = driver.findElement(By.xpath("//input[@type='tel']"));
                phNumber.sendKeys("9994816808");
             
                WebElement txtpass = driver.findElement(By.id("firstpassword"));
                txtpass.sendKeys("vjjjjjjhhff");
               WebElement confpass = driver.findElement(By.id("secondpassword"));
                 confpass.sendKeys("bihbhbhbh");
                 
                 WebElement langu= driver.findElement(By.id("msdd"));
                 langu.sendKeys("ENGLISH");
	}

}
