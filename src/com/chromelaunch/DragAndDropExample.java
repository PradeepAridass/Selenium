package com.chromelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://demoqa.com/droppable/");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		ac.clickAndHold(drag).perform();
		ac.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
