package com.hexaware.orangehrm;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\aaron\\\\eclipse-workspace\\\\Selenium\\\\src\\\\test\\\\resources\\\\chromedriver-win64\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");;
	/*Thread.sleep(5000);

	  driver.findElement(By.name("q")).sendKeys("QSpiders");
	  Thread.sleep(5000); 
	  
	  List<WebElement> suggestion=driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));


	  Thread.sleep(5000);
	int count= suggestion.size();

	Thread.sleep(5000);
	System.out.println(count);



	  for(int i=0;i<count;i++)
	  {
	    Thread.sleep(5000);
	 
	WebElement element1=    suggestion.get(i);
	Thread.sleep(5000);
	 
	System.out.println(element1.getText());

} */
	
//	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//	  driver.findElement(By.name("password")).sendKeys("admin123");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	WebDriverWait wait=new WebDriverWait(driver,5);
//	wait.until(ExpectedConditions.titleContains("OrangeHRM"));
//	System.out.println("Page Loaded");

}
}
