package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("//div[@class=\"bk-focus__info\"]");
	Thread.sleep(2000);
	List<WebElement> all = driver.findElements(By.xpath("(//div[@class=\"bk-focus__info\"]//tr)[3]//td"));
	                 int colSize = all.size();
	                 System.out.println(colSize);
	
}
}
