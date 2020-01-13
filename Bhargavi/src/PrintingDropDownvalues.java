import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PrintingDropDownvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		WebElement dropdown=driver.findElement(By.id("c0"));
		List<WebElement> ele=dropdown.findElements(By.tagName("option"));
	
		for(int i=0;i<ele.size();i++){
			String values =ele.get(i).getText();
			System.out.println(values);
		}
		driver.close();

	}

}
