package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice6 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	         WebElement electronic = driver.findElement(By.xpath("//div[text()='Electronics']"));


	Actions act = new Actions(driver);
	
	Thread.sleep(2000);
	
	act.moveToElement(electronic).perform();
	Thread.sleep(2000);
WebElement next1 = driver.findElement(By.xpath("(//a[contains(@href,\"https://www.flipkart.com/camera-clp-store?otracker=nmenu_sub_Electronics_0_\")])[1]"));			
	act.moveToElement(next1).perform();
	Thread.sleep(2000);
	
	     WebElement next2 = driver.findElement(By.xpath("//a[contains(@href,'https://www.flipkart.com/camera-accessories/tripods/pr?sid=jek,6l2,c')]"));
	       
  // act.moveToElement(next2).click().perform();
	   act.click(next2).perform();
}
}