package com.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DraggableDemo extends TestBaseSetup{

	@BeforeMethod
	public void teststarted(){
		System.out.println("The Draggable testcase got started");
	}

	@Test
	public void Draggable(){
		
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions action=new Actions(driver);
		action.dragAndDropBy(driver.findElement(By.id("draggable")), 168, 97).perform();
		driver.switchTo().defaultContent();
	}
	
	
	@AfterMethod
	public void teststopped(){
		System.out.println("The Draggable testcase got stopped");
	}

	}


