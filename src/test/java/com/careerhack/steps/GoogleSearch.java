package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.careerhack.common.GoogleBaseHeists;
import com.careerhack.pages.PageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch extends GoogleBaseHeists {
	


	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		LaunchBrowser ();
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		// step 1: identify the web element and give the element a name
		// 8 locators:
		//id, name, tag, class name, linktext, partial linktext, xpath, css-selector
		
		//WebElement searchbox;
		//searchbox = driver.findElement(By.name("q"));
		
		// step 2: perform action
		
		//searchbox.sendKeys(string);
		
		PageObjects po = new PageObjects(driver);
		po.enterSearch(string);

	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		//WebElement searchBtn;
		//searchBtn = driver.findElement(By.name("btnK"));
		
		//searchBtn.click();
		
		// if click of submit doesnt work
		// WebElement.sendkeys(keys.RETURN);
		
		PageObjects po = new PageObjects (driver);
		po.clickSearch();
	
	}

	@Then("i receive releted search result")
	public void i_receive_releted_search_result() {

		//WebElement resultStats;
		//resultStats = driver.findElement(By.id("result-stats"));
		
		//String results = resultStats.getText();
		
		//System.out.println("==================================");
		//System.out.println(results);
		//System.out.println("==================================");
		
		//driver.close();
		
		
		PageObjects po = new PageObjects (driver);
		po.result();
		
		po.close();
	}
	
	

}
