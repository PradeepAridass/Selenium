package com.chromelaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
			
			System.out.println("--------Web Element---------");
			for (WebElement data : alldata) {
				System.out.println(data.getText());
			}
			
			System.out.println("-------Select Row Element---------");
			 List<WebElement> row5 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[6]/td"));
			 for (WebElement row : row5) {
				System.out.println(row.getText());
			}
			 System.out.println("-----------Header Element---------------");
			List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
			for (WebElement headerName : header) {
				System.out.println(headerName.getText());
			}
			System.out.println("=====================================================");
			driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
			List<WebElement> table1 = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td"));
			for (WebElement table : table1) {
				System.out.println(table.getText());
			}
			
				
	}

}
