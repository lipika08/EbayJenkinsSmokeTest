package com.smoketestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class EbaySearchPageTest {
	
public static WebDriver driver;
	
	@BeforeClass
	
	public void OpenBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	
	public void VerifySearchPage()
	{
		WebElement SearchBox = driver.findElement(By.xpath("//input[@title='Search']"));
		WebElement SearchIcon = driver.findElement(By.id("gh-search-btn"));
		
		SearchBox.sendKeys("Shirts");
		SearchIcon.click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	
	@AfterClass
	
	public void CloseBrowser()
	{
		driver.quit();
	}
}

