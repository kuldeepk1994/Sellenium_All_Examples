package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getRowSize {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/kulde/OneDrive/Desktop/testing/HTML_practice/sample1.html");
	Thread.sleep(2000);
	// find rowSize
	
	List<WebElement> allRow = driver.findElements(By.xpath("//table[@id=\"1234\"]//tr"));
	               int size = allRow.size();
	               System.out.println(size);
	               System.out.println("--------");
	               // fin colSize for header
	           List<WebElement> AllCol = driver.findElements(By.xpath("//table[@id=\"1234\"]//tr[1]/th"));
	          int ColSize = AllCol.size();
	          System.out.println(ColSize);
}
}
