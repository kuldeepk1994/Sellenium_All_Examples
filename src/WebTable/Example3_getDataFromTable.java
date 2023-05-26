package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_getDataFromTable {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("file:///C:/Users/kulde/OneDrive/Desktop/testing/HTML_practice/sample1.html");
	 Thread.sleep(2000);
	 // getData from 3rd row and 2nd column
	 WebElement text = driver.findElement(By.xpath("((//table[@id=\"1234\"]//tr)[3]//td)[2]"));
	                   String value = text.getText();
	                   System.out.println(value);
}
}
