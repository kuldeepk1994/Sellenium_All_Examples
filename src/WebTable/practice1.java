package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.programiz.com/sql/online-compiler/");
	 Thread.sleep(2000);
	 List<WebElement> allRow = driver.findElements(By.xpath("(//div[@class=\"table-data\"])[1]//tr"));
	                       int RowSize = allRow.size();
	                       System.out.println(RowSize);
	                       System.out.println("---");
	                       
	                      List<WebElement> allCol = driver.findElements(By.xpath("((//div[@class=\"table-data\"])[1]//tr)[1]/th"));
	                      int colSize = allCol.size();
	                      System.out.println(colSize);
	                      
}
}
