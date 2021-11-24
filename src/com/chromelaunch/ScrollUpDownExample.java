package com.chromelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDownExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Admin\\eclipse-workspace\\SeleniumWorkout\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/elements");
		Thread.sleep(2000);
		WebElement dn = driver.findElement(By.xpath("(//div[@class='header-wrapper'])[3]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView()", dn);
		Thread.sleep(2000);
		dn.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[text()='New Window Message']")).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
