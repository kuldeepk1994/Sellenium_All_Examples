package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo22 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("redmi");
	 Thread.sleep(2000);
	           List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
	           Thread.sleep(2000);
	           
	           String exptext = "redmi note 10";
	          
			for(WebElement a1:allOptions)
			{
				   String acttext = a1.getText();
				   if(acttext.equals(exptext))
				   {
					   a1.click();
					   break;
				   }
			}
}
}
