import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowBasedAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://only-testing-blog.blogspot.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='post-body-4105674242499183386']/div[1]/form/input[10]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\bhargavi.exe");
		
		//driver.close();

	}

}
