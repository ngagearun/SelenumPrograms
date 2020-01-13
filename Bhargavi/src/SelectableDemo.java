import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SelectableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/selectable/");
		//Thread.sleep(3000);
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		WebElement item1 =driver.findElement(By.xpath(".//*[@id='selectable']/li[1]"));
		WebElement item3 =driver.findElement(By.xpath(".//*[@id='selectable']/li[3]"));
		WebElement item4 =driver.findElement(By.xpath(".//*[@id='selectable']/li[4]"));
		WebElement item5 =driver.findElement(By.xpath(".//*[@id='selectable']/li[5]"));
		
		action.keyDown(Keys.CONTROL).click(item1).click(item3).click(item4).click(item5).perform();
		action.keyUp(Keys.CONTROL).perform();
	//	Thread.sleep(5000);
		driver.close();
		
		
	}

}
