package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Phones");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[contains(@class,'input ')])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@class=\"s-image\"])[3]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	                  Set<String> allIds = driver.getWindowHandles();
	                  ArrayList<String> a1 = new ArrayList<>(allIds);
	                                  String childWindowId = a1.get(1);
	
	   driver.switchTo().window("childWindowId");
	   //Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[contains(@title,'Shopping ')]")).click();
	   
}
}
