import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumhq.org");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(3000);
        driver.findElement(By.linkText("Download")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Documentation")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        String currenturl=driver.getCurrentUrl();
        driver.get(currenturl);
        Thread.sleep(3000);
        driver.navigate().to(currenturl);
        Thread.sleep(3000);
        driver.findElement(By.linkText("Documentation")).sendKeys(Keys.F5);
        Thread.sleep(3000);
        driver.close();
        
        
        

	}

}
