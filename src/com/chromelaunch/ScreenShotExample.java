package com.chromelaunch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
	TakesScreenshot t = (TakesScreenshot) driver;
	File a = t.getScreenshotAs(OutputType.FILE);
	File b = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\bookmyshow\\png");
	
	FileUtils.copyToDirectory(a, b);
	//driver.close();
	}

}

