package com.chromelaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			System.out.println();
			System.out.println("--------Header---------");
			
			List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
			
			for (WebElement element : header) {
				System.out.println(element.getText());
			}
			System.out.println("---------Elements----------");
			List<WebElement> allDatas = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
			
			for (WebElement data : allDatas) {
				System.out.println(data.getText());
			}
			
			
			
			Thread.sleep(2000);
			driver.close();
	}

}
