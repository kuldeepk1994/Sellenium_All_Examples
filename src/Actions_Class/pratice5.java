package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pratice5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	WebElement electronic = driver.findElement(By.xpath("(//div[@class=\"xtXmba\"])[4]"));
	
	Actions act = new Actions(driver);
	act.moveToElement(electronic).perform();
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//a[@class=\"_6WOcW9 _2-k99T\"]")).click();
	
	//driver.findElement(By.xpath("//a[@class=\"_6WOcW9 _2-k99T\"]")).click();
WebElement next = driver.findElement(By.xpath("(//a[contains(@href,\"https://www.flipkart.com/camera-clp-store?otracker=nmenu_sub_Electronics\")])[1]"));
       act.moveToElement(next).perform();



}
}