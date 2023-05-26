package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo29 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.sbimf.com/mutual-fund/equity-mutual-funds");
	 Thread.sleep(2000);
	List<WebElement> all = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	System.out.println(all.size());
	                 for(WebElement s1:all)
	                 {
	                	s1.click();
	                	Thread.sleep(2000);
	                 }
}
}
