package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLoginTestCase {

	WebDriver driver;

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)", "");
	}

	@Test(groups = { "SmokeTest", "RegressionTest" })
	public void facebookLogin() {

		driver.findElement(By.id("email")).sendKeys("sampleUser");
		driver.findElement(By.id("pass")).sendKeys("samplePassword");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
	}

	@Test(groups = { "RegressionTest" })
	public void getTitle() {

		String str = driver.getTitle();
		System.out.println("Title is:" + str);
	}

	@Test(groups = { "SmokeTest" })
	public void getPageSource() {

//		String str = driver.getPageSource();
		System.out.println("Source is:" );
	}

	@BeforeMethod
	public void launchApp() {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		scroll();
		System.out.println("Scrolled");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod(alwaysRun = true)
	public void closeApp() {
		driver.close();
	}
}
