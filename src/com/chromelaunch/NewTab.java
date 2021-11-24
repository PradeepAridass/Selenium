package com.chromelaunch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTab {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();

		driver.navigate().to("https://www.snapdeal.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pushDenied")).click();
		Thread.sleep(2000);
		 
		WebElement allOffers = driver.findElement(By.linkText("All Offers"));
		Actions ac = new Actions(driver);
		Thread.sleep(1500);
		ac.moveToElement(allOffers).perform();
		Thread.sleep(1500);
		
		WebElement airPurifier = driver.findElement(By.linkText("Air Purifiers"));
		ac.contextClick(airPurifier).perform();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1500);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement dresses = driver.findElement(By.linkText("Dresses"));
		ac.contextClick(dresses).perform();
		Thread.sleep(1500);

		Robot c = new Robot();
		c.keyPress(KeyEvent.VK_DOWN);
		c.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1500);
		c.keyPress(KeyEvent.VK_ENTER);
		
		WebElement casualShoes = driver.findElement(By.linkText("Casual Shoes"));
		ac.contextClick(casualShoes).perform();
		Thread.sleep(1500);
		
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		s.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1500);
		s.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
