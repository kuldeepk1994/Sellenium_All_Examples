package Practice;

import java.util.List;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo14 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(2000);
	 WebElement all = driver.findElement(By.xpath("(//select[contains(@class,'_9407')])[2]"));
                Select s1 = new Select(all);
                              List<WebElement> a1 = s1.getOptions();
                              System.out.println(a1.size());
}
}
