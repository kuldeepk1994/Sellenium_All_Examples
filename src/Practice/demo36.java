package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo36 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 WebElement accountList = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	 Thread.sleep(2000);
	 
	 Actions act = new Actions(driver);
	 Thread.sleep(2000);
	 act.moveToElement(accountList).perform();
			 
	 
}
}
