package WebElement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_method_example1 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(2000);
boolean result = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).isSelected();
System.out.println(result);
if(result)
{
	System.out.println("Radio Button is selected");
}
else
{
	System.out.println("Radio button is De-selected");
}
}
}
