package com.chromelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseCursorMove {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(1000);
			
		driver.findElement(By.id("pushDenied")).click();
		
		WebElement allOffers = driver.findElement(By.linkText("All Offers"));
		Actions ac = new Actions(driver);
		ac.moveToElement(allOffers).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Decorative Lighting")).click();
		Thread.sleep(2000);
		
		
		driver.close();
	}

}
