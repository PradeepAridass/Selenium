package com.chromelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.navigate().to("http://www.amazon.in");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile"+Keys.ENTER);
	//driver.findElement(By.id("search_query_top")).sendKeys("Faded Short Sleeve T-shirts"+Keys.ENTER);
	//driver.findElement(By.xpath(null))
	driver.close();
	
}
}
