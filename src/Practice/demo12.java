package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo12 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/delete_customer.php");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("kuldeep");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
	 Thread.sleep(2000);
	 Alert alt = driver.switchTo().alert();
	String text = alt.getText();
	System.out.println(text);
	alt.dismiss();
}
}
