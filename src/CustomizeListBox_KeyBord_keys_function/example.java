package CustomizeListBox_KeyBord_keys_function;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	Thread.sleep(2000);

	
	Actions act = new Actions(driver);
	
	act.click(month).perform();
	Thread.sleep(2000);
	
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
//	act.sendKeys(Keys.ENTER).perform();
//	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
    Thread.sleep(2000);
    act.sendKeys(Keys.ENTER).perform();
	
	
			
}
}
