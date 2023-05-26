package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice2 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.geeksforgeeks.org/how-to-perform-right-click-using-java-in-selenium/");
	 Thread.sleep(2000);
	WebElement practice = driver.findElement(By.xpath("//span[text()='Practice']"));
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(practice).perform();
	Thread.sleep(2000);
	WebElement next = driver.findElement(By.xpath("//span[text()='Curated DSA Lists']"));
	
	Thread.sleep(2000);
	act.moveToElement(next).perform();
	 
}
}
