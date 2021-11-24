package com.chromelaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DropDownExample extends BaseClass{
	 public static void main(String[] args) throws InterruptedException {
		browser("chrome");
		//maximizeWindow();
		getUrl("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		
		WebElement l = driver.findElement(By.className("login"));
		clickElement(l);
		
		WebElement c = driver.findElement(By.id("email_create"));
		sendValue(c, "pradeepstar@gmail.com");
		Thread.sleep(2000);
	
		WebElement c1 = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		clickElement(c1);
		Thread.sleep(2000);
		
		WebElement gender = driver.findElement(By.id("id_gender1"));
		clickElement(gender);
		Thread.sleep(1500);
		
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		sendValue(firstName, "Pradeep");
		Thread.sleep(1500);
		
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		sendValue(lastName, "A");
		Thread.sleep(1500);
		
		WebElement password = driver.findElement(By.id("passwd"));
		sendValue(password, "Mani9225@");
		Thread.sleep(1500);
		
		WebElement day = driver.findElement(By.id("days"));
		dropDownMulti(day, 5);
		Thread.sleep(1500);
		
		WebElement month = driver.findElement(By.id("months"));
		dropDownValue(month, "9");
		Thread.sleep(1500);
		
		WebElement year = driver.findElement(By.id("years"));
		dropDownVisible(year, "2019  ");
		Thread.sleep(1500);

		WebElement name1 = driver.findElement(By.id("firstname"));
		sendValue(name1, "Pradeep");
		
		WebElement lastName1 = driver.findElement(By.id("lastname"));
		sendValue(lastName1, "A");
		
		WebElement company = driver.findElement(By.id("company"));
		sendValue(company, "Green Technology");
		
		WebElement address = driver.findElement(By.id("address1"));
		sendValue(address, "Adyar");
		
		WebElement city = driver.findElement(By.id("city"));
		sendValue(city, "Chennai");
		
		WebElement state = driver.findElement(By.id("id_state"));
		dropDownVisible(state, "Indiana");
		
		WebElement postCode = driver.findElement(By.id("postcode"));
		sendValue(postCode, "600020");
		
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		sendValue(mobile, "8424824223");
		
		WebElement raddress = driver.findElement(By.id("alias"));
		sendValue(raddress, "Sai Royal Mens Hostel, Adyar, Chennai");
		
		WebElement register = driver.findElement(By.linkText("Register"));
		clickElement(register);
		
		
		
		Thread.sleep(3000);
		close();
	}

}
