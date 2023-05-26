package POp_UP;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_ChildbrowserPopup_windowpopup {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://skpatro.github.io/demo/links/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 //click on "NewTab" from main page
	 
	 driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
	 Thread.sleep(2000);
	 
	             //get child window ID

	                      Set<String> allIds = driver.getWindowHandles();
	                    //{mainPageID, childWindowID}
	                      
	                      ArrayList<String> a1 = new ArrayList<String>(allIds);
	                      
	                    //{mainPageID(0), childWindowID(1)}

	                      String childWindowID = a1.get(1);  //String        childWindowID
	               //switch to child window
	 driver.switchTo().window(childWindowID);
	 //click on "Training" link from child window
	 driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
}
}
