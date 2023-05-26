package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo38 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
//	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("redmi");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()=' note 12 pro']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Redmi Note 12 5G Frosted Green 6GB RAM 128GB ROM ')]")).click();
	Thread.sleep(2000);
	             Set<String> all = driver.getWindowHandles();
	             
	             ArrayList<String> allids= new ArrayList<String>(all);
	             
	             String windowid = allids.get(1);
	             
	             driver.switchTo().window(windowid);
	             Thread.sleep(2000);
	             driver.findElement(By.xpath("//input[@title=\"Add to Shopping Cart\"]")).click();
	             Thread.sleep(2000);
	             driver.findElement(By.xpath("//a[@id=\"attach-close_sideSheet-link\"]")).click();
	             Thread.sleep(2000);
	             WebElement cart = driver.findElement(By.xpath("//span[@class=\"nav-cart-icon nav-sprite\"]"));
	            Thread.sleep(2000);
	            Actions act = new Actions(driver);
	            Thread.sleep(1000);
	            act.moveToElement(cart).click().perform();
	            
	             
}
}
