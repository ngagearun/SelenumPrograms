import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MouseHoverActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[1]/a/span"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[3]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[3]/div/div/div[1]/div[1]/div/div/a")).click();
		Thread.sleep(3000);
		
		Select s1=new Select(driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select")));
		s1.selectByVisibleText("₹10000");
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
