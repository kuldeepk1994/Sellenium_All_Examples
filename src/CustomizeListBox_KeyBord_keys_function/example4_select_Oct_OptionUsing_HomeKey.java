package CustomizeListBox_KeyBord_keys_function;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example4_select_Oct_OptionUsing_HomeKey {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(1000);
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	act.click(month).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.HOME).perform();
	Thread.sleep(2000);
	
	//step navigate to OCT option using "Arrow_Down" key

	for(int i=1; i<=9; i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
	}
	
	act.sendKeys(Keys.ENTER).perform();

	
	
}
}
