package com.chromelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement cart = driver.findElement(By.xpath("(//span[@aria-hidden='true'])[3]"));
		cart.click();
		
		WebElement signin = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		signin.click();
	
		WebElement cont = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		cont.click();
		Thread.sleep(2000);
		
		WebElement help = driver.findElement(By.xpath("//span[@class='a-expander-prompt']"));
		help.click();
		
		
		WebElement newacc = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		newacc.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
