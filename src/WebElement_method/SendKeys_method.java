package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_method {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kuldeep");
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("jshhdhd");
}
}
