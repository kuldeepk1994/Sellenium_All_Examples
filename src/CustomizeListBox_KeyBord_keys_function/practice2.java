package CustomizeListBox_KeyBord_keys_function;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice2 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	 Thread.sleep(2000);
	 WebElement year = driver.findElement(By.xpath("//select[@title=\"Year\"]"));
	 Actions act = new Actions(driver);
	 Thread.sleep(2000);
	 act.click(year).perform();
	 Thread.sleep(2000);
	 for(int i=1;i<=4;i++)
	 {
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(2000);
		 
	 }
	 act.sendKeys(Keys.ENTER).perform();
}
}
