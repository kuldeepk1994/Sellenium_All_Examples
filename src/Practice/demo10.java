package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo10 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//input[contains(@class,'VJZDxU')]")).sendKeys("9575909694");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[contains(@class,'_2HKlqd ')]")).click();
}
}
