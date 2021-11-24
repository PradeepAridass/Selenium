package com.chromelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	driver.switchTo().frame("singleframe");
	
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hava a nice day");
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	
	/*driver.switchTo().frame("float: left;height: 300px;width:600px");
	
	driver.switchTo().frame("float: left;height: 250px;width: 400px");*/
	
	WebElement parent = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	driver.switchTo().frame(parent);
	WebElement child = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	driver.switchTo().frame(child);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Good day");
	
	Thread.sleep(2000);
	driver.quit();
	}
}