package com.testng;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBaseSetup {
	
	//String browsername="firefox";
	 WebDriver driver;
	@Parameters("browsername")
	@BeforeTest
	public void launchbrowser(String browsername){
		
		if(browsername.equalsIgnoreCase("firefox")){
		driver =new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("chrome"))
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");{
			driver =new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://www.mortgagecalculator.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	
	@AfterTest
	public void closebrowser(){

		driver.quit();
	}
}
