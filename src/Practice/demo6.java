package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://skpatro.github.io/demo/links/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("(//input[@type=\"button\"])[3]")).click();
	                        Set<String> allid = driver.getWindowHandles();
	                        ArrayList<String> a1 = new ArrayList<>(allid);
	                              String childWindowId = a1.get(1);
	
driver.switchTo().window(childWindowId);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	 
	 driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
}
}
