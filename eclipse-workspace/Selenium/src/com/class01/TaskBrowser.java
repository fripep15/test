package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskBrowser {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

    WebDriver driver=new ChromeDriver();
    
    driver.get("http://Amazon.com");
    
 String actualTitle=driver.getTitle();
 System.out.println(actualTitle);
    
 
 System.out.println("Second part &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
 
    /*
     * opern chrome browser
     * navigte to https://syntaxtechscom/
     * navigate to https://www.google.come/"
     * 
     * navigate back to Syntax Technologies page
     * Refresh Current page
     * Verify url contans Syntax"
     * 
     */
 

	}

}
