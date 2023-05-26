package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_dynamicXpath_flipkart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("redmi note 11");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(4000);
	String review = driver.findElement(By.xpath("((//div[@class=\"_2kHMtA\"])[1]//span)[8]")).getText();
	Thread.sleep(1000);
	System.out.println(review);
	
	
}
}
