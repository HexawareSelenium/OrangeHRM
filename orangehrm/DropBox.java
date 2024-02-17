package com.hexaware.orangehrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropBox {
	
	public static void main(String[] args) throws InterruptedException {
	 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaron\\eclipse-workspace\\Selenium\\src\\test\\resources\\chromedriver-win64\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
	Select sel=new Select(element);
	sel.selectByIndex(2);
	Thread.sleep(2000);
	sel.selectByVisibleText("Desktops");
	sel.deselectAll();

	List<WebElement> li=sel.getOptions();
	int count=li.size();
	System.out.println(count);
	
	}

}
