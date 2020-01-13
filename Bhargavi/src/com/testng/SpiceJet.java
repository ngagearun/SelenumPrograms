package com.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpiceJet extends TestBaseSetup {
 
 
 @Test
 public void Onewaytrip() throws InterruptedException
 {
  
  
 // Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
  //s1.selectByVisibleText("Hyderabad (HYD)");
  //driver.findElement(By.className("flightSearchContainer")).click();
  //driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]")).click();
  //driver.findElement(By.name("ctl00$mainContent$ddl_originStation1")).click();
  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
  //Thread.sleep(1000);
  //driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).sendKeys("Newjersey");
  //Thread.sleep(1000);
  //driver.findElement(By.xpath("//a[contains(text(),'Inbox')")).click();
  //driver.findElement(By.xpath("//div[contains(text(),'originStation1')]")).click();
  driver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]")).click();
 }

 

}