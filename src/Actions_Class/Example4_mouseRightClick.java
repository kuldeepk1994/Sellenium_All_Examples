package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_mouseRightClick {
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	//driver.findElement(By.xpath(""))
	driver.manage().window().maximize();
	WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	

	//act.moveToElement(RightClick).contextClick().perform();
	
//	             act.moveToElement(RightClick).perform();
//	             act.contextClick().perform();
	
	      act.contextClick(RightClick).perform();
	

}
}
