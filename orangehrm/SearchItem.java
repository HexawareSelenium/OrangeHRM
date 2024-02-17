package com.hexaware.orangehrm;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SearchItem {
 
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	driver.findElement(By.name("q")).sendKeys("QSpiders");
	Thread.sleep(5000);
 
	TakesScreenshot scr=(TakesScreenshot)driver;
	File src=scr.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\aaron\\Downloads\\Screenshot.png");
	FileUtils.copyFile(src, dest);

	
	List<WebElement> suggestion=driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));

	Thread.sleep(5000);
 
	int count=	suggestion.size();
	Thread.sleep(5000);
 
	System.out.println(count);

	for(int i=0;i<count;i++)
	{
		Thread.sleep(5000);
		WebElement element1 = suggestion.get(i);
		Thread.sleep(5000);
		System.out.println(element1.getText());
	}
	}
}