package Dynamic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver  = new ChromeDriver();
	driver.get("https://www.timeanddate.com/worldclock/india/new-delhi");
	Thread.sleep(2000);
	String text = driver.findElement(By.xpath("(//div[@id=\"qlook\"]//span)[3]")).getText();
	Thread.sleep(2000);
	System.out.println(text);
}
}
