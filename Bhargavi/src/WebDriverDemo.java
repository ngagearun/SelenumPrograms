import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).sendKeys("40000");
		Thread.sleep(3000);
		driver.findElement(By.id("downpayment")).sendKeys("40000");
		Thread.sleep(3000);
		driver.findElement(By.name("cal")).click();
		driver.quit();
		
		
	}

}
