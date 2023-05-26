package POp_UP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ImplicitWait {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 
	//click on create new acc link
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 
	 // enter fullName
	 driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("kuldeep");
	 
}
}
