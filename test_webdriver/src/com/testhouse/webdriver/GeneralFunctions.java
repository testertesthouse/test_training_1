package com.testhouse.webdriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GeneralFunctions {

	public void propertiestest()
	{try {
		FileReader reader = new FileReader("config.properties");
		Properties property = new Properties();
		property.load(reader);
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void browserIn(String browser)
	{
	System.setProperty("chrome", "chromedriver.exe");
	if(browser.equalsIgnoreCase("FF"))
	{
		driver = new FirefoxDriver();
	}
	if(browser.equalsIgnoreCase("chrome"))
	
	{
		driver = new ChromeDriver();
	}
		
	}
	
	@AfterMethod
	public void browserOut()
	{
		 driver.close();
		 driver.quit();
	}
	
}
