package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example5_mouseLeftClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	WebElement acc = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
	
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(acc).click().perform();
			
	
	
}
}
