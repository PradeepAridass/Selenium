package com.chromelaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MulltiUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.in/");
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().to("https://www.swiggy.com/");
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String url = driver.getCurrentUrl();
		String t = driver.getTitle();
		
		System.out.println(url);
		System.out.println(t);
		
		driver.close();
		
		
	}

}
