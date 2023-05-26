package POp_UP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Hidden_Division_PoP_UP {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	//here taken flipkart example for pop up bcz hidden division pop present in flikart
	
	driver.findElement(By.xpath("//input[contains(@class,'_2IX_2')]")).sendKeys("kuldeep");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l ')])[1]")).click();
	
	
}
}
