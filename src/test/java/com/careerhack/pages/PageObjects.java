package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	
	WebDriver driver;
	
	public PageObjects(WebDriver driver){
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		//WebElement searchbox;
		//searchbox = driver.findElement(By.name("q"));
		
		@FindBy(name ="q")
		WebElement searchbox;
		
		//searchbox.sendKeys(string);
		public void enterSearch(String text) {
			searchbox.sendKeys(text);
		}	
			//WebElement searchBtn;
			//searchBtn = driver.findElement(By.name("btnK"));
			
			@FindBy(name = "btnK")
			WebElement searchBtn;
			
			
			//searchBtn.click();
			
			public void clickSearch() {
				searchBtn.click();
		}
		
			
			//WebElement resultStats;
			//resultStats = driver.findElement(By.id("resultStats"));	
			//String results = resultStats.getText();
		 
			@FindBy(id = "result-stats")
			WebElement resultStats;
			
			public void result() {

				System.out.println("==================================");
				System.out.println(resultStats);
				System.out.println("==================================");
			}
			public void	close() {
				driver.close();
			}
			
		}
			
	


