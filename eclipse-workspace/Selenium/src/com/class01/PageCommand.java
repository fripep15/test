package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\attau\\eclipse-workspace\\Selenium\\" + "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		final String expectedTitle="Google";
		//driver.getTitle();
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("the actual and expected Title matched");
		}else {
			System.err.println("the actual and expected Title did not matched");
		}
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		// how to get url
		String expectedUrl="https://www.google.com/?gws_rd=ssl";
		//driver.getCurrentUrl();
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		//String expectedUrl="http:google.com";
	//	final String expectedUrl="Google";
		if(expectedUrl.equals(actualUrl)) {
		System.out.println("Both URL matched");
	}else {
		//System.err.println("Actual and expected Url did not matched\");
System.err.println("The Url did not matched");
	}
}
}