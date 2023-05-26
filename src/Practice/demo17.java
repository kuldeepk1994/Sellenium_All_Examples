package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo17 {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	 
	 List<WebElement> alltext = driver.findElements(By.xpath("//a"));
	 System.out.println(alltext.size());
	 for(WebElement a1:alltext)
	 {
		System.out.println(a1.getText()); 
	 }
}
}
