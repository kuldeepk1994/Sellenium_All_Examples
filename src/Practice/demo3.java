package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
public static void main(String[] args)
{WebDriver driver = new ChromeDriver();
driver.get("https://www.meesho.com/");
List<WebElement> alltext = driver.findElements(By.xpath("//a"));
for(WebElement a1:alltext)
{
	System.out.println(a1.getText());
	
}
System.out.println(alltext.size());
		
	
	
	
	
}
}
