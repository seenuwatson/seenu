package task_Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskNumber4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
         String title=   driver.getTitle();
	    System.out.println(title);
	      
	    String currentUrl = driver.getCurrentUrl();
	     System.out.println(currentUrl);
	     
	      
		     WebElement btnlogin =driver.findElement(By.xpath("//input [@type='text']"));
		     btnlogin.click();
		     
		     WebElement txtId = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		      txtId.sendKeys("seenivasan4320");
	    
	   
	      WebElement password = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));  
	       password.sendKeys("869595");
		   

	 
}}
// id="AuthenticationFG.ACCESS_CODE" 