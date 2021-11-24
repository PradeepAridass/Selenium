package com.chromelaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.co.in/");
		
		driver.navigate().to("https://www.amazon.in/");
		
	}

}
