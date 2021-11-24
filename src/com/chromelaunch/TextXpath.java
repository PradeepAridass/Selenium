package com.chromelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextXpath {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.id("username")).sendKeys("8545125652");
		driver.findElement(By.xpath("//button[@data-cy='continueBtn']")).click();
		driver.findElement(By.xpath("//a[@class='modalBack capText font12 latoBlack']")).click();
		//driver.close();
	}

}
