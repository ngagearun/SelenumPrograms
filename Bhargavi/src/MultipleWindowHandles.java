import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		String main_window=driver.getWindowHandle();
		driver.findElement(By.linkText("MSN")).click();
		Set<String>  windows =driver.getWindowHandles();
		Iterator<String> itr =windows.iterator();
		while(itr.hasNext()){			
			String window_names =itr.next();
			if(!window_names.equals(main_window)){
				driver.switchTo().window(window_names);
				driver.findElement(By.xpath(".//*[@id='q']")).sendKeys("selenium");
			}
			
		}
		
		driver.close();//current window
		driver.switchTo().window(main_window);
		driver.findElement(By.xpath(".//*[@id='sb_form_q']")).sendKeys("Selenium");
		driver.close();
		
		
		
	}

}
