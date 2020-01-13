import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bsc/dailygroupa?");
		WebElement table_locator =driver.findElement(By.className("dataTable"));
		
		List<WebElement> no_of_rows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		
		System.out.println(no_of_rows.size());
		
		for(int i=0;i<2;i++){
			
			List<WebElement> no_of_cols=no_of_rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<no_of_cols.size();j++){
				
				String value =no_of_cols.get(j).getText();
				System.out.println(value);
			}
			
			
			
		}
		
		
		driver.close();

	}

}
