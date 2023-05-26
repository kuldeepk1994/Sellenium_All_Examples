package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo19 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	 Thread.sleep(1000);
    driver.findElement(By.xpath("//div[text()='Electronics']"));
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//a[contains(@class,'_3YpNQe')])[4]")).click();
} 
}
