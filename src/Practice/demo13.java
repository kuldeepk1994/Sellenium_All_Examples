package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo13 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://skpatro.github.io/demo/links/");
	 driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 Set<String> allid = driver.getWindowHandles();
	 ArrayList<String> a1 = new ArrayList<>(allid);
	                       driver.switchTo().window(a1.get(1));
	                       Thread.sleep(2000);
	 //driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	                       WebElement more = driver.findElement(By.xpath("(//span[text()='More'])[1]"));
	                      Select s1 = new Select(more);
	                                      List<WebElement> all = s1.getOptions();
	                                                  int a = all.size();
	                                                  System.out.println(a);
	                         
	                        
}
}
