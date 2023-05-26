package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo15 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	List<WebElement> alltextB = driver.findElements(By.xpath("//input[@type='text']"));
	
	
	ArrayList<String> value = new ArrayList<>();
	value.add("kuldeep");
	value.add("kushwaha");
}
}
