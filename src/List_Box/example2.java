package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(2000);
   WebElement all = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
   Select s1 = new Select(all);
		               List<WebElement> opt = s1.getOptions();
		            System.out.println(opt.size());
		            for(WebElement a1:opt)
		            {
		            	System.out.println(a1.getText());
		            }
                          
	 
}
}
