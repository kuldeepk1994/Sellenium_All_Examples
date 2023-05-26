package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo37 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(2000);
	 WebElement country = driver.findElement(By.xpath("(//span[@class=\"nav-line-2\"])[1]"));
	             WebElement acList = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
	 
	 Actions act = new Actions(driver);
	 
	 act.moveToElement(country).perform();
	 Thread.sleep(2000);
	 act.moveToElement(acList).perform();
	 
}
}
