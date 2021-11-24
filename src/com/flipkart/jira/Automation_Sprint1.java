package com.flipkart.jira;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_Sprint1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement appliances = driver.findElement(By.xpath("//img[@alt='Appliances']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(appliances).perform();
		Thread.sleep(2000);
		WebElement television = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		television.click();
		WebElement dn = driver.findElement(By.xpath("//div[@class='QvtND5 _2w_U27']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView()", dn);
		Thread.sleep(3000);
		driver.close();

}
}
