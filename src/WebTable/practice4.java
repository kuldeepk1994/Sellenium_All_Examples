package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice4 {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.timeanddate.com/worldclock/india/new-delhi");
Thread.sleep(2000);
List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"bk-focus__info\"]//tr"));
            int RowSize = all.size();
            System.out.println(RowSize);
            
}
}
