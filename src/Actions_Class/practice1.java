package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
	                
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	
	act.moveToElement(fashion).perform();
	Thread.sleep(20000);
	driver.findElement(By.xpath("(//a[@class=\"_6WOcW9 _3YpNQe\"])[2]")).click();
}
}
