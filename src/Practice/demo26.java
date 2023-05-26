package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo26 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("fridge");
	Thread.sleep(2000);
	List<WebElement> allopt = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
	
	               String exp = "fridge cover";
	               for(WebElement s1:allopt)
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
