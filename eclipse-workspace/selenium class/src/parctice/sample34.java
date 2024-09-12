package parctice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample34 {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://omrbranch.com/apitestingtraininginchennaiomr");
	WebElement days = driver.findElement(By.id("days"));
	Select select=new Select(days);
	select.selectByIndex(15);
	
	List<WebElement> options = select.getOptions();
	WebElement webElement = options.get(5);
	String text = webElement.getText();
	System.out.println(text);
	
	for (int i = 0; i < options.size(); i++) {
		WebElement webElement2 = options.get(i);
		String text2 = webElement2.getText();
		System.out.println(text2);
		
	}
	
	driver.close();
}
}
