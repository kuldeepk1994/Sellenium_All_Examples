package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2_popup {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/delete_customer.php");
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("kuldeep");
	  
	  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	  
	  Alert mn = driver.switchTo().alert();
	  String text = mn.getText();
	System.out.println(text);

	
	     mn.accept();
	   
	     mn.accept();
	     
	
	  
}
}
