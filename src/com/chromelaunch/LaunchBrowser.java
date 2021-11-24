package com.chromelaunch;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LaunchBrowser extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		browser("chrome");
		getUrl("http://www.leafground.com/");
		WebElement r = driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']"));
		rightClick(r);
		robotTab();
		WebElement r1 = driver.findElement(By.xpath("//img[@alt='Buttons']"));
		rightClick(r1);
		robotTab();
		WebElement r2 = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[7]"));
		rightClick(r2);
		robotTab();
		windowHandle();
		currentWindow("TestLeaf - Selenium Playground");
		Thread.sleep(2000);
		
		//quit();
	}

}
