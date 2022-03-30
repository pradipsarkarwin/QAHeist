package com.careerhack.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleBaseHeists  {
	
	public WebDriver driver;
	
	public void LaunchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	 
		
	}

}
