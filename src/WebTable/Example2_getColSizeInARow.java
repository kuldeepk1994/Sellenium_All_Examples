package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getColSizeInARow {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/kulde/OneDrive/Desktop/testing/HTML_practice/sample1.html");
	Thread.sleep(2000);
	// colSize of 3rd row
	List<WebElement> allCol = driver.findElements(By.xpath("(//table[@id=\"1234\"]//tr)[3]/td"));
	             int size = allCol.size();
	             System.out.println(size);
}
}
