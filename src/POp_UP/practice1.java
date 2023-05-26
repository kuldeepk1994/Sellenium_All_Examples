package POp_UP;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("table fan");
	 Thread.sleep(2000);
               driver.findElement(By.xpath("//div[@aria-label=\"table fan high speed\"]")).click();
               
	 

	 
}
}
