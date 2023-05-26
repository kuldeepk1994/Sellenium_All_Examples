package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("(//select[contains(@class,'_5dba ')])[2]"));
	           Select s = new Select(month);
	         List<WebElement> opt = s.getOptions();
	                      for(WebElement a1:opt)
	                      {
	                    	  System.out.println(a1.getText());
	                      }
}
}
