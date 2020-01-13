package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTest {
  @Test
  public void f1() {
	  System.out.println("I am in testing Method of F1");
  }
  
  @Test
  public void f2() {
	  System.out.println("I am in testing Method of F2");
  }
  
  @Test
  public void f3() {
	  System.out.println("I am in testing Method of F3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in beforeMethod");
  }

  @Test
  public void afterMethod() {
	  System.out.println("I am in AfterMethod");
  }

  @Test
  public void beforeClass() {
	  System.out.println("I am in beforeclass Method");
  }

  @Test
  public void afterClass() {
	  System.out.println("I am in Afterclass method");
  }

  @Test
  public void beforeTest() {
	  System.out.println("I am in beforeTest Method");
  }

  @Test
  public void afterTest() {
	  System.out.println("I am in AfterTest Method");
  }

 @Test
  public void beforeSuite() {
	  System.out.println("I am in BeforeSuite Method");
  }

  @Test
  public void afterSuite() {
	  System.out.println("I am in AfterSuite Method");

  }

}
