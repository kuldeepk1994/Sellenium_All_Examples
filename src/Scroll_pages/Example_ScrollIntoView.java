package Scroll_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ScrollIntoView {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
// this is target 
	 WebElement item = driver.findElement(By.xpath("//a[@href=\"help/637205020878504\"]"));
	 // scroll up to target
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", item);
}
}
