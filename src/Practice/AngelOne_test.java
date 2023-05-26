package Practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AngelOne_test {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.angelone.in/");
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
	Thread.sleep(2000);
	 WebElement stock = driver.findElement(By.xpath("((//div[@class=\"center\"])[2]//a)[1]"));
	 Thread.sleep(2000);
	 Actions act = new Actions(driver);
	 act.moveToElement(stock).click().perform();
}
}
