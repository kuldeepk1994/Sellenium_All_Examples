package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3_popup {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.absolution-cosmetics.com/");
	 Thread.sleep(2000);
	 //driver.findElement(By.xpath("//a[contains(@id,'cookie')]")).click();
	 //driver.findElement(By.xpath("(//input[contains(@class,'mailchimp')])[3]")).sendKeys("abc@gmail.com");
	 driver.findElement(By.xpath("(//button[contains(@onclick,'tarteaucitron')])[21]")).click();
	 driver.findElement(By.xpath("//span[text()='Subscribe']"));
}
}
