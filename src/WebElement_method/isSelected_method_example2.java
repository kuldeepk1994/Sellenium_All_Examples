package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_method_example2 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(2000);
	 WebElement female = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
	 female.click();
	boolean result = female.isSelected();
	System.out.println(result);
	if(result)
	{
		System.out.println("Radio Button is selected");
	}
	else
	{
		System.out.println("RAdio Button is not selected");
	}
	 
}
}
