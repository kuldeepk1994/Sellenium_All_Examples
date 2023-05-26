package CustomizeListBox_KeyBord_keys_function;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example5_select_Oct_OptionUsing_EndKey {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	 
	 Actions act = new Actions(driver);
	 

	 
	 act.click(month).perform();
	 Thread.sleep(2000);
	//navigate to last option using "End" key
	act.sendKeys(Keys.END).perform();
	Thread.sleep(2000);
	//step navigate to OCT option using "Arrow_UP" key

	for(int i=1; i<=2; i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
	}
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
	
	
} 
 
}
