import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebBasedAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.navigate().to("http://only-testing-blog.blogspot.com/");	
		driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/button[1]")).click();
		WebDriverWait wait =new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());		
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
