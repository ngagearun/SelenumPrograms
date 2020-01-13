import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DraggableDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Documents\\Bhargavi\\configuration.properties");
		Properties p=new Properties();
		p.load(fi);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(p.getProperty("URL"));
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions action=new Actions(driver);
		action.dragAndDropBy(driver.findElement(By.id("draggable")), 168, 97).perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
