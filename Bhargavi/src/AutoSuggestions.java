import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("s");
		WebElement ele =driver.findElement(By.id("ui-id-1"));
		System.out.println(ele);
		List<WebElement> list_values=ele.findElements(By.xpath("li/div"));
		System.out.println(list_values.size());
		for(int i=0;i<list_values.size();i++){
			String values=list_values.get(i).getText();
			if(values.equalsIgnoreCase("BASIC")){
				list_values.get(i).click();
				break;
			}
		}
		driver.close();

	}

}
