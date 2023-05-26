package POp_UP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_alert_pop_up_ {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("kuldeep");
driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
                             
                              //1: getText from alert popup
                              String text = driver.switchTo().alert().getText();
                              System.out.println(text);
                            //  click on cancel button from Alert POP up
                              Thread.sleep(2000);
                              driver.switchTo().alert().dismiss();
}
}
