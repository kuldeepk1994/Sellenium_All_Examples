package SuggetionHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("ac");
		List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
		Thread.sleep(2000);
		String exp = "ac 1.5 ton";
		for(WebElement a1:all)
		{
			String act = a1.getText();
			if(act.equals(exp))
			{
				a1.click();
				break;
			}
		}
		
	}

}
