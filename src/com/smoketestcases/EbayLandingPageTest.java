package com.smoketestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EbayLandingPageTest {

	public static WebDriver driver;

	@BeforeClass

	public void OpenBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@Test

	public void VerifyLandingPageDetails() {
		System.out.println("Verifying Landing Page Details Test case");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

	@Test

	public void VerifyLandPageContents() {
		System.out.println("Verifying Landing Page Contents Test case");
		WebElement SearchIcon = driver.findElement(By.id("gh-search-btn"));
		System.out.println(SearchIcon.isDisplayed() + "If the Search icon is displayed");

	}

	@AfterClass

	public void CloseBrowser() {
		driver.quit();
	}
}
