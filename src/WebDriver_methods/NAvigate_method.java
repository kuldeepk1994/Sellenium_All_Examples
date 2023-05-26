package WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NAvigate_method {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
			  driver.navigate().to("https://www.amazon.in/");
			  Thread.sleep(2000);
			  driver.navigate().to("https://www.flipkart.com/");
			  Thread.sleep(2000);
			  driver.navigate().to("https://www.paytm.in/");
			  Thread.sleep(2000);
		
			  
}
}
