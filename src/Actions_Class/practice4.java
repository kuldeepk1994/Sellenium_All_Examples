package Actions_Class;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	WebElement electronic = driver.findElement(By.xpath("//div[text()='Electronics']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(electronic).perform();
	WebElement next = driver.findElement(By.xpath("//a[@class=\"_6WOcW9 _2-k99T\"]"));
	Thread.sleep(2000);
	act.moveToElement(next).perform();
	
}
}
