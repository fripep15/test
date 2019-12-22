package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		// system is class.setproperty();is a static method,
		
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// https hyper text transfer protocal source
		driver.get("http://www.google.com");
		
		//Thread.sleep(1000); this is just to to keep it stay for a while
		
		driver.get("http:www.Syntaxtechs.com");
		
		driver.navigate().to("http:facebook.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		String actualTile=driver.getTitle();
		System.out.println(actualTile);
		
		driver.close();
	}
}
