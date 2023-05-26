package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://skpatro.github.io/demo/links/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
	 
	               Set<String> hand = driver.getWindowHandles();
	               
	             ArrayList<String> a1 = new ArrayList<>(hand);
	                               String chiwindolID = a1.get(1);
	 
	  
	driver.switchTo().window(chiwindolID);
	 driver.findElement(By.xpath("(//i[contains(@class,'fa')])[1]")).click();
	
}
}