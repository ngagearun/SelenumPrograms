package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppableDemo extends TestBaseSetup{
	
	
	@BeforeMethod
	public void teststarted(){
		System.out.println("The Droppable testcase got started");
	}
	
	@Test
	public void Droppable(){
		
		driver.findElement(By.linkText("Droppable")).click();
		Actions action =new Actions(driver);
		driver.switchTo().frame(0);
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		driver.switchTo().defaultContent();
	}

	
	@AfterMethod
	public void teststopped(){
		System.out.println("The Droppable testcase got started");
	}
	
}
