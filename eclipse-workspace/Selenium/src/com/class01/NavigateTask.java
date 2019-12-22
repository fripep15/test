package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTask {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

	    WebDriver driver=new ChromeDriver();
		
		 String expectedUrl="http:www.Syntaxtechs.com";
		 
		driver.navigate().to("http:www.Syntaxtechs.com");;
		 
		 String actualUrl=driver.getCurrentUrl();
		 
		 System.out.println(actualUrl);
		    

	}

}
