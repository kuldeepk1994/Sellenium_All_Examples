package SuggetionHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//button[contains(@class,\"_2KpZ6l\")])[1]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("redmi");
	 Thread.sleep(2000);
	                             List<WebElement> all = driver.findElements(By.xpath("//ul[@class=\"col-12-12 _1MRYA1 _38UFBk\"]/li"));
	 
	 String exp ="redmi note 12";

	 for(WebElement a1:all)
	 {
		 String act = a1.getText();
		 if(act.equals(exp))
		 { 
			 a1.click();
			 break;
		 }
	 }
}
}
