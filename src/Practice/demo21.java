package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo21 {


public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("samsung");
            List<WebElement> allopt = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
            
                   String expText = "samsung galaxy";
                   for(WebElement s1:allopt)
                   {
                	   String actText = s1.getText();
                	   if(actText.equals(expText))
                	   {
                		   s1.click();
                		   break;
                	   }
                   }
                   
            
            
            
}
}
