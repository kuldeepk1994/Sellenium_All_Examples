package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class demo32 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"xtXmba\"]"));
	          for(WebElement a1:all)
	          {
	        	  System.out.println(a1.getText());
	          }
}
}
