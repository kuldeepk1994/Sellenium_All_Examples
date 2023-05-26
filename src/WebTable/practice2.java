package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.programiz.com/sql/online-compiler/");
	 //find headr column size
	List<WebElement> all = driver.findElements(By.xpath("(//div[@class=\"table-data\"])[1]//tr/th"));
	                     int hdSize = all.size();
	                     System.out.println(hdSize);
}
}
