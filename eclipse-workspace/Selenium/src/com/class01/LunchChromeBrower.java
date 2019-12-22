package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrower {

	public static void main(String[] args) throws InterruptedException {
		// system is a class. setProperty(); is a static method
				//                     key                          value
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\attau\\eclipse-workspace\\Selenium\\" + "drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				// http-->hypertext transfer protocol
				driver.get("http://www.google.com");
				Thread.sleep(1000);
				//browser navigation commands
				// 1: it will navigate to a given url it will navigate back
				driver.navigate().to("http://www.facebook.com");
				// 2:it will navigate back
				driver.navigate().back();
				//3: it will navigate one step forward
				driver.navigate().forward();
				driver.close();
				// to get the page title
				driver.getTitle();
				String actualTitle=driver.getTitle();
				System.out.println(actualTitle);
	}
}