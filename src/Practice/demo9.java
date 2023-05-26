package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://skpatro.github.io/demo/links/");
	 
	//click on "NewTab" from main page
	 
	 driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	//get child window ID
	                   Set<String> allId = driver.getWindowHandles();
	                 //{mainPageID, childWindowID}

	                   ArrayList<String> a1 = new ArrayList<>(allId);
	                                     //String ChildWindowId = a1.get(1);
	                   
	                 //{mainPageID(0), childWindowID(1)}

	                 //switch to child window            
	 driver.switchTo().window(a1.get(1));      //String childWindowID
	//click on "Training" link from childWindow
	 driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	                   //switch to main page

	                        driver.switchTo().window(a1.get(0));
	                        Thread.sleep(2000);
	                      //click on "NewWindow" from main page

	                        driver.findElement(By.xpath("(//input[@type=\"button\"])[3]")).click();
	                                 
}
}
