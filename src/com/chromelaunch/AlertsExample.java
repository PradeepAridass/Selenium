	package com.chromelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(1000);
		
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prompt.click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().sendKeys("Pradeep");
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
