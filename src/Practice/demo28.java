package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo28 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(1000);
	List<WebElement> all = driver.findElements(By.xpath("//input[@type=\"text\"]"));
	Thread.sleep(2000);
	all.get(2).sendKeys("kuldeep");
	Thread.sleep(4000);
	all.get(3).sendKeys("kushwaha");
	Thread.sleep(2000);
	all.get(4).sendKeys("927388282");
	
}
}
