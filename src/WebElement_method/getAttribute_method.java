package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute_method {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 WebElement us = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1')])[1]"));
	 us.sendKeys("kuldeep");
	 Thread.sleep(2000);
	 String text = us.getAttribute("value");
	 System.out.println(text);

}
}
