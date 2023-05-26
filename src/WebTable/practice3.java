package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.programiz.com/sql/online-compiler/");
	 Thread.sleep(2000);
 WebElement text = driver.findElement(By.xpath("(((//div[@class=\"table-data\"])[1]//tr)[3]//td)[2]"));
	String value = text.getText();
	System.out.println(value);
}
}
