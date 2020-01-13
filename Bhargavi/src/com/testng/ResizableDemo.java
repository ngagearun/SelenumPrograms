package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResizableDemo extends TestBaseSetup {
	

	@BeforeMethod
	public void teststarted(){
		System.out.println("The Resiable testcase got started");
	}
	
	@Test
	public void Resizable(){
		
		driver.findElement(By.linkText("Resizable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions action=new Actions(driver);
		action.dragAndDropBy(driver.findElement(By.xpath(".//*[@id='resizable']/div[3]")), 168, 97).perform();
		driver.switchTo().defaultContent();
	}
	
	@AfterMethod
	public void teststopped(){
		System.out.println("The Resiable testcase got stopped");
	}
	
	

}
