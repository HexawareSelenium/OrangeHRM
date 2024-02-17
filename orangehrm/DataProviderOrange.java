package com.hexaware.orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderOrange {
	
	WebDriver driver;

	@DataProvider
	public Object[][] getData() {
		Object[][] Data = new Object[1][2];
		Data[0][0] = "Admin";
		Data[0][1] = "admin123";
		
		return Data;
	}
	
	@Test(dataProvider="getData")
	public void login(Object username, Object password)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();     
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys((CharSequence[]) username);
        driver.findElement(By.name("password")).sendKeys((CharSequence[]) password);
        
	}
}
