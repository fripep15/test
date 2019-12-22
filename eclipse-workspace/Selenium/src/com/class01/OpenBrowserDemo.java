package com.class01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("http://www.yahoo.com");
		driver.get("https://canvas.instructure.com/courses/1666955/files/folder/SELENIUM%20AUTOMATION/Selenium%20Classes/Class%201?preview=85522513");
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		driver.getPageSource();
		driver.close();
		
		
		
		
		
	}

}
