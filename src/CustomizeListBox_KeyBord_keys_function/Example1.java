package CustomizeListBox_KeyBord_keys_function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 
	 Thread.sleep(2000);
	 
	 WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	 Thread.sleep(2000);
	 Actions act = new Actions(driver);
	 act.click(month).perform();
	 Thread.sleep(2000);
//	 
//	 act.sendKeys(Keys.ARROW_DOWN).perform();
//	 Thread.sleep(1000);
//	 act.sendKeys(Keys.ARROW_DOWN).perform();
//	 Thread.sleep(1000);
//	 act.sendKeys(Keys.ARROW_DOWN).perform();
//	 Thread.sleep(1000);
//	 act.sendKeys(Keys.ARROW_DOWN).perform();
//	 Thread.sleep(1000);
//	 act.sendKeys(Keys.ARROW_DOWN).perform();
//	 Thread.sleep(1000);
//	 
//	 act.sendKeys(Keys.ENTER).perform();
	 
	 
}
}
