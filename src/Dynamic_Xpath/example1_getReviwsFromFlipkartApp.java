package Dynamic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_getReviwsFromFlipkartApp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	// click on close button pop up
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	
	//enter mob name
Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("redmi9a");
	
	//click on search button
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	
	//get Review
	Thread.sleep(3000);
	String Review = driver.findElement(By.xpath("((//div[@class=\"_2kHMtA\"])[1]//span)[8]")).getText();
	Thread.sleep(1000);
	System.out.println(Review);
	
	
}
}
