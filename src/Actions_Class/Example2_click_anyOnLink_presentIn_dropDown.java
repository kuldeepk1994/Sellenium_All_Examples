package Actions_Class;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_click_anyOnLink_presentIn_dropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	// click on pop close button
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	// mouse move to login link
	WebElement login = driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
	Thread.sleep(2000);
	// create object of Actions class
	Actions act= new Actions(driver);
	// To mouse move to login link used moveToElement method of actions class
  act.moveToElement(login).perform();
  
  // step3 : click on wishlist
  driver.findElement(By.xpath("(//div[@class=\"_3vhnxf\"])[4]")).click();
}
}
