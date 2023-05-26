package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo33 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("headphones");
	Thread.sleep(2000);
	List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div/div/div"));
	               String exp="headphones wireless";
	               for(WebElement s1:all)
	               {
	            	  String act = s1.getText();
	            	   if(act.equals(exp))
	            	   {
	            		   s1.click();
	            		   break;
	            	   }
	               }
}
}
