package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
	                       Set<String> allId = driver.getWindowHandles();
	ArrayList<String> a1 = new ArrayList<>(allId);
	              String childWindoId = a1.get(1);
	
	driver.switchTo().window("childWindoId");
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
}
}
