package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_dynamixXpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("redmi");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("class=\"a-section\"")).click();
	
}
}
