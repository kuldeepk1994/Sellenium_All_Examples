package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplay_method {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	 System.out.println(result);
	 if(result)
	 {
		 System.out.println("Logo is present");
	 }
	 else
	 {
		 System.out.println("Logo not [present");
	 }
}
}
