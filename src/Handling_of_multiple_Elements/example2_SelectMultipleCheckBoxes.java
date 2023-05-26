package Handling_of_multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SelectMultipleCheckBoxes {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/kulde/OneDrive/Desktop/testing/HTML_practice/multiWebElements.html");
	                      List<WebElement> allcheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
	                      
	          System.out.println(allcheck.size());  
	          for(WebElement a1:allcheck)
	          {
	        	a1.click();
	        	Thread.sleep(600);
	          }
	                        
}
}
