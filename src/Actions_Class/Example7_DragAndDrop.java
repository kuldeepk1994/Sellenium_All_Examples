package Actions_Class;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example7_DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/drag_drop.html");
	 Thread.sleep(2000);
	 WebElement src = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
	 Thread.sleep(2000);
	             WebElement det = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
	             Thread.sleep(2000);
	          Actions act = new Actions(driver);
	          
	          act.dragAndDrop(src, det).perform();
	        		  
}
}
