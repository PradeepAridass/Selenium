package com.chromelaunch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	
	// Maximize Window

	public static void maximizeWindow() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Browser Launch 

	public static WebDriver browser(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Admin\\eclipse-workspace\\SeleniumWorkout\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\IEDriverServer.exe");
				driver = new ChromeDriver();
			}else {
				System.out.println("Invalid Browser Name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	// Get URL

	public static void getUrl(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Navigate to

	public static void getNavigateTo(String navigate) {
		try {
			driver.navigate().to(navigate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Navigate Back

	public static void getNavigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Navigate Forword

	public static void getNavigateForword() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Navigate Refresh

	public static void getNavigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// SendKeys
	
	public static void sendValue(WebElement e, CharSequence v) {
		try {
			e.sendKeys(v);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	// Take ScreenShot 
	
	public static void takeScreenshot() throws IOException {
		try {
			 TakesScreenshot t = (TakesScreenshot) driver;
			
			File scrFile = t.getScreenshotAs(OutputType.FILE);
			
			File desFile = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\png");
			
			FileUtils.copyToDirectory(scrFile, desFile);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	// Action  - move to element

	public static void actionMoveTo(WebElement x) {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(x).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Action - Right Click
	
	public static void rightClick(WebElement x) {
		try {
			Actions a = new Actions(driver);
			a.contextClick(x).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	// Robot for New Tab

	public static void robotTab() {
		try {
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Robot for New Window

	public static void robotWindow() {
		try {
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	// Robot for Incognito Window

	public static void robotIncognitoWindow() {
		try {
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	//  Window Handle

	public static void windowHandle() {
		try {
			String id = driver.getWindowHandle();
			System.out.println("Current Window ID: "+id);
			String title = driver.switchTo().window(id).getTitle();
			System.out.println("Current Window Title: "+title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Window Handles for ID

	public static void windowHandlesID() {
		try {
			Set<String> multiID = driver.getWindowHandles();
			for (String id : multiID) {
				System.out.println("Opened Windows ID: "+id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Windows Handles for Title

	public static void windowHandlesTitle() {
		try {
			Set<String> multiTitle = driver.getWindowHandles();
			for (String title : multiTitle) {
				String t = driver.switchTo().window(title).getTitle();
				System.out.println("Opened Windows Title: "+t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Windows Handles for change current URL

	public static void currentWindow(String x) {
		try {
			Set<String> multiID = driver.getWindowHandles();
			for (String id : multiID) {
				System.out.println("Opened Windows ID: "+id);
			}
			String s = x;
			for (String c : multiID) {
				if (driver.switchTo().window(c).getTitle().equalsIgnoreCase(s)) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//  Get Current URL

	public static void getCurrentUrl() {
		try {
			String present = driver.getCurrentUrl();
			System.out.println("Current URL: "+present);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Frame

	public static void singleFrame(String x) {
		try {
			driver.switchTo().frame(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Nested Frame

	public static void multiFrame(String x, String y) {
		try {
			driver.switchTo().frame(x);
			driver.switchTo().frame(y);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	//	Default Page

	public static void defaultContent() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Get Title

	public static void getText() {
		try {
			String title = driver.getTitle();
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Implicit Wait
	
	public static void waitimplicit(long x) {
		try {
			driver.manage().timeouts().implicitlyWait(x, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	

	// Explicit Wait for Alert

	public static void waitAlert (long x) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, x);
			wait.until(ExpectedConditions.alertIsPresent());

			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Explicit Wait for Visibility

	public static void waitVisible(long x) {
		try {
			driver.manage().timeouts().implicitlyWait(x, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Fluent Wait

	public static void waitFluent(long x, long y) {
		try {
			Wait w = new FluentWait(driver).withTimeout(x, TimeUnit.SECONDS)
					.pollingEvery(y, TimeUnit.SECONDS).ignoring(Exception.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Get Current URL Title

	public void getCTitle() {
		try {
			String i = driver.getWindowHandle();
			String title = driver.switchTo().window(i).getTitle();
			System.out.println("Current Page Title: "+title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// selection or not

	public static void select(WebElement x) {
		try {
			boolean s = x.isSelected();
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Change Selection
	
	public static void isSelection(WebElement x, WebElement y) {
		try {
			if (x.isSelected()) {
				y.click();
			}else {
				x.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Enable or not
	
	public static void isEnable(WebElement x) {
		try {
			boolean e = x.isEnabled();
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Drop Down by Index
	
	public void dropIndex(WebElement x, int y) {
		try {
			Select s = new Select(x);
			s.selectByIndex(y);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Drop Down by Value
	
	public static void dropDownValue(WebElement x, String y) {
		try {
			Select s = new Select(x);
			s.selectByValue(y);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Drop down by Visible Text
	
	public static void dropDownVisible(WebElement x, String y) {
		try {
			Select s = new Select(x);
			s.selectByVisibleText(y);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Drop Down Count
	
	public static void dropDownCount(WebElement x) {
		try {
			Select s = new Select(x);
			List<WebElement> d = s.getOptions();
			int size = d.size();
			System.out.println("Drop Down Elements count: "+size);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Drop Down by SendKey
	
	public static void dropDownSendKey(WebElement x, CharSequence y) {
		try {
			new Select(x);
			x.sendKeys(y);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Drop Down by MultiSelection
	
	public static void dropDownMulti(WebElement x, int a) {
		try {
			Select s = new Select(x);
			for (int i = 0; i < a; i++) {
				s.selectByIndex(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Click
	
	public static void clickElement(WebElement x) {
		try {
			x.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Multiple or not
	
	public static void displayElement(WebElement x) {
		try {
			Select s = new Select(x);
			boolean m = s.isMultiple();
			System.out.println(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Scroll UP
	
	public static void scrollup(WebElement x) {
		try {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].scrollIntoView()", x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Scroll Down
	
	public static void scrolldown(WebElement x) {
		try {
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].scrollIntoView", x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Normal Alert
	
	public static void simpleAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Conform Alert
	
	public static void conformAlert(String a) {
		try {
			if (a.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();
			}else if (a.equalsIgnoreCase("cancel")){
				driver.switchTo().alert().dismiss();
			}
			else {
				System.out.println("Invalid Input");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Prompt Alert
	
	public static void promptAlert(String s) {
		try {
			Alert a = driver.switchTo().alert();
			a.sendKeys(s);
			a.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	// Get Attribute
	
	public static void getAttribute(WebElement x, String y) {
		try {
			String a = x.getAttribute(y);
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Get text
	
	public static void gettext(WebElement x) {
		try {
			String text = x.getText();
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	// Close Current Window

		public static void close() {
			try {
				driver.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// Close all Windows

		public static void quit() {
			try {
				driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	
}





