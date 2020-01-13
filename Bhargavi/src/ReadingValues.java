import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadingValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Div1']/button")).click();
		Thread.sleep(3000);
		String month=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		String year=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		System.out.println("Month=    "+month+"Year=    "+year);
		driver.close();
		

	}

}
