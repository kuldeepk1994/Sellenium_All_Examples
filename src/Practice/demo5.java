package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://skpatro.github.io/demo/links/");
	 driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	 
	                             Set<String> hand = driver.getWindowHandles();
	                             
	                             ArrayList<String> a1 = new ArrayList<>(hand);
	                             
	                                                     String windowId = a1.get(1);
	
	 driver.switchTo().window(windowId);
	 driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
}
}
