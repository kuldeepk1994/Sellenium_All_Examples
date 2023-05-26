package POp_UP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_alert_pop_up_ {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/delete_customer.php");
	 
	 driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("kuldeeep");
	 
	 driver.findElement(By.xpath("//input[@name='submit']")).click();
	 Thread.sleep(2000);
	 
	 // to click on "OK" button from alert POP up
	 driver.switchTo().alert().accept();
	 
	 // to click on "OK" button from alert 2nd POP up
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();
}
}
