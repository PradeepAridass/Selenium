package com.chromelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	driver.findElement(By.xpath("//div[@class='icon mail']")).click();
	
	
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='phone-no ']")).sendKeys("9532215562");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	Thread.sleep(3000);
	driver.close();

}
}
