package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo20 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l ')])[1]")).click();
	 Thread.sleep(2000);
	// driver.findElement(By.xpath(""))
	 
}
}
