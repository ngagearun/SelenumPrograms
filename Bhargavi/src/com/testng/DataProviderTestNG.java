package com.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	WebDriver driver;//instance variable
	
	@BeforeTest
	public void launchbrowser(){
		
		driver=new FirefoxDriver();
		driver.get("http://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	
	@Test(dataProvider="CalculateAmount")
	public void calculate(String homevalue,String loanamount,String interestrate) throws InterruptedException{
		
		driver.findElement(By.name("param[homevalue]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("param[homevalue]")).sendKeys(homevalue);
		driver.findElement(By.id("loanamt")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("loanamt")).sendKeys(loanamount);
		driver.findElement(By.id("intrstsrate")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("intrstsrate")).sendKeys(interestrate);
		driver.findElement(By.name("cal")).click();
		
	}
	
	@DataProvider(name="CalculateAmount")
	public String[][] setinputvalues() throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		String [][] str=readingdatafromexcel("C:\\Users\\Lenovo\\Desktop\\arun.xlsx","ReadingData");
		return str;
		
	}	
	
	public  String[][] readingdatafromexcel(String excelpath, String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		String excelData[][] = null;
		FileInputStream fi=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet s=wb.getSheet(sheetname);
		
	
		int tot_rows=s.getLastRowNum();
		int tot_cols=s.getRow(0).getLastCellNum();
		excelData=new String[tot_rows-1][tot_cols];
		for(int i=1;i<tot_rows;i++){
			
			for(int j=0;j<tot_cols;j++){
			
				excelData[i-1][j] =s.getRow(i).getCell(j).getStringCellValue();
			}			
		}
		
		return excelData;
	}

		
	@AfterTest
	public void close_browser(){
		driver.close();
	}

}
