package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo27 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.google.com/");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("infinix");
	 Thread.sleep(1000);
	 List<WebElement> allopt = driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]/li"));
	 
	         String exp = "infinix hot 8";
	         for(WebElement s1:allopt)
	         {
	        	 String act = s1.getText();
	        	 if(act.equals(exp))
	        	 {
	        		 s1.click();
	        	 }
	         }
	 
}
}
