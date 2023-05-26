package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_isEnable_method {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		boolean result =driver.findElement(By.xpath("//button[contains(@class,'_acap ')]")).isEnabled();
		System.out.println(result);
		
		//here verify the link is enabled nor not with the help of isEnabled method
		
		if(result)
		{
			System.out.println("login link is enabled");
			
		}
		else
		{
			System.out.println("login link is not enabled");
		}
}
}
