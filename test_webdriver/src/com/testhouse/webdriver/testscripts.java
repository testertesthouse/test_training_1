package com.testhouse.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
@Test
public class testscripts extends GeneralFunctions {
public void webdrivertest() throws InterruptedException {
	
	
    driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
    driver.navigate().refresh();
    driver.findElement(By.linkText("Hotels")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
   

}
	
	
	

}
