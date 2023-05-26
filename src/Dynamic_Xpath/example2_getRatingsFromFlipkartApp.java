package Dynamic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getRatingsFromFlipkartApp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	// click on close button POP up
	
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	Thread.sleep(2000);
	
	//enter mob
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("redmi note 9");
	
	//click on search button
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	
	//get rating
	Thread.sleep(3000);
	String rating = driver.findElement(By.xpath("((//div[@class=\"_2kHMtA\"])[1]//span)[6]")).getText();
	System.out.println(rating);
}
}
