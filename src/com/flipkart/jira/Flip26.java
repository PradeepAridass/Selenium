package com.flipkart.jira;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flip26 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
		close.click();
		Thread.sleep(2000);
		
		WebElement appliances = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[7]"));
		Actions a = new Actions(driver);
		a.moveToElement(appliances).perform();
		Thread.sleep(2000);
		
		WebElement television = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		television.click();
		Thread.sleep(2000);
		
		WebElement scrollDown = driver.findElement(By.xpath("//div[text()='Mi']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView()", scrollDown);
		Thread.sleep(2000);
		
		WebElement brand = driver.findElement(By.xpath("//span[text()='68 MORE']"));
		brand.click();
//	
		//driver.close();
}
}
