package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo31 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.meesho.com/");
	driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("sarree");

}
}
