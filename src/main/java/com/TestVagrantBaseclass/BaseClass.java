package com.TestVagrantBaseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browser_Configuration(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void clickOnElement(String type , WebElement element) {

		if (type.equalsIgnoreCase("Click")) {
			element.click();
		}
		else if (type.equalsIgnoreCase("Clear")) {
			element.clear();
		}
	}
	
	public static void inputValues(WebElement element,String type) {
          element.sendKeys(type);
	}
	
	
	public static void getUrl(String url) {

		driver.get(url);
	}

	
	public static  String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public static void driver_Operations(String type) {
		if (type.equalsIgnoreCase("close")) {
			driver.close();
			
		} else if (type.equalsIgnoreCase("quit")) {
			driver.quit();
		} else if (type.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}else if (type.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}else if (type.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}
	public static void waitbrowser(String type,int sec) throws Exception {
		if (type.equalsIgnoreCase("wait")) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		} else if (type.equalsIgnoreCase("longwait")) {
			Thread.sleep(sec);
		} 

		
		

	}
	
	
	
	
}
