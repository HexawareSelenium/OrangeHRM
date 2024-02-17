package com.hexaware.orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedData {
	WebDriver driver;

	@Test
	@Parameters({"username", "password"})
	
	public void login(String username, String password)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();     
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        
	}
}
