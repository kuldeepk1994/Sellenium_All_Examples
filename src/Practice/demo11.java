package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo11 {
public static void main(String[] args) throws InterruptedException {
	// alert pop up
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/delete_customer.php");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("kuldeep");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();
	 Thread.sleep(1000);
	 driver.switchTo().alert().accept();
}
}
