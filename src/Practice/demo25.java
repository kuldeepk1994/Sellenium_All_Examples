package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo25 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("washing machine");
	Thread.sleep(1000);
	List<WebElement> allOpt = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
	                 String exp = "washing machine repair";
	                 for(WebElement s1:allOpt)
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
