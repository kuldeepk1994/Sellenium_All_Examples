package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class  Example1_handlingOfDropdown{
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		// click on close button
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		//step 1 : mouse  move to login button
		
		WebElement login = driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
		//step2 :to mouse  move to login button --create object of Actions class
		
		Actions act = new Actions(driver);
		//step3 :to mouse  move to login button -- call moveToElement method of Actions class
		 act.moveToElement(login).perform();
		 
		 
		
	}

}
