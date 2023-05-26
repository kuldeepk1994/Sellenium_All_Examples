package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_isEnable_method {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       Thread.sleep(2000);
      boolean result = driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
	 System.out.println(result);
}
}
