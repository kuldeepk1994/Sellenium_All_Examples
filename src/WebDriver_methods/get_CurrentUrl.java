package WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_CurrentUrl {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
String text = driver.getCurrentUrl();
System.out.println(text);





}
}
